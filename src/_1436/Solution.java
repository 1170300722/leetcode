package _1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public String destCity(List<List<String>> paths) {
		Set<String> temp = new HashSet<String>();
		for (List<String> x : paths) {
			temp.add((String) x.toArray()[x.size() - 1]);
		}
		for (List<String> x : paths) {
			temp.remove((String) x.toArray()[0]);
		}
		return (String) temp.toArray()[0];
	}
}
//1436. �����յ�վ
//����һ��������·ͼ������·ͼ�е�������·������ paths ��ʾ������ paths[i] = [cityAi, cityBi] ��ʾ����·����� cityAi ֱ��ǰ�� cityBi �������ҳ�������е��յ�վ����û���κο���ͨ���������е���·�ĳ��С�
//
//��Ŀ���ݱ�֤��·ͼ���γ�һ��������ѭ������·�����ǡ��һ�������յ�վ��
//
// 
//
//ʾ�� 1��
//
//���룺paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
//�����"Sao Paulo" 
//���ͣ��� "London" ���������ִ��յ�վ "Sao Paulo" ���������е�·���� "London" -> "New York" -> "Lima" -> "Sao Paulo" ��
//ʾ�� 2��
//
//���룺paths = [["B","C"],["D","B"],["C","A"]]
//�����"A"
//���ͣ����п��ܵ���·�ǣ�
//"D" -> "B" -> "C" -> "A". 
//"B" -> "C" -> "A". 
//"C" -> "A". 
//"A". 
//��Ȼ�������յ�վ�� "A" ��
//ʾ�� 3��
//
//���룺paths = [["A","Z"]]
//�����"Z"
// 
//
//��ʾ��
//
//1 <= paths.length <= 100
//paths[i].length == 2
//1 <= cityAi.length, cityBi.length <= 10
//cityAi != cityBi
//�����ַ������ɴ�СдӢ����ĸ�Ϳո��ַ���ɡ�