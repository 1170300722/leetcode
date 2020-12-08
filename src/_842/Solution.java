package _842;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> splitIntoFibonacci(String S) {
		List<Integer> res = new ArrayList<>();
		backtrack(S.toCharArray(), res, 0);
		return res;
	}

	public boolean backtrack(char[] digit, List<Integer> res, int index) {
		// �߽������жϣ������ȡ���ˣ�����res���ȴ��ڵ���3����ʾ�ҵ���һ����ϡ�
		if (index == digit.length && res.size() >= 3) {
			return true;
		}
		for (int i = index; i < digit.length; i++) {
			// ��λ���ϵ����ֲ�����0��ͷ
			if (digit[index] == '0' && i > index) {
				break;
			}
			// ��ȡ�ַ���ת��Ϊ����
			long num = subDigit(digit, index, i + 1);
			// �����ȡ�����ִ���int�����ֵ������ֹ��ȡ
			if (num > Integer.MAX_VALUE) {
				break;
			}
			int size = res.size();
			// �����ȡ�����ִ���res��ǰ�������ֵĺͣ�˵����ν�ȡ��̫��ֱ����ֹ����Ϊ����Խ��ȡԽ��
			if (size >= 2 && num > res.get(size - 1) + res.get(size - 2)) {
				break;
			}
			if (size <= 1 || num == res.get(size - 1) + res.get(size - 2)) {
				// ������num��ӵ�����res��
				res.add((int) num);
				// ����ҵ��˾�ֱ�ӷ���
				if (backtrack(digit, res, i + 1))
					return true;
				// ���û�ҵ����ͻ��߻�����һ����Ȼ�����һ����ӵ�����res�е����ָ��Ƴ���
				res.remove(res.size() - 1);
			}
		}
		return false;
	}

	// �൱�ڽ�ȡ�ַ���S�е��Ӵ�Ȼ��ת��Ϊʮ��������
	private long subDigit(char[] digit, int start, int end) {
		long res = 0;
		for (int i = start; i < end; i++) {
			res = res * 10 + digit[i] - '0';
		}
		return res;
	}

}
