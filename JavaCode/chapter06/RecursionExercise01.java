public class RecursionExercise01{
	public static void main(String[] args){
		//����
		//���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
		// �Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ���������� 10 ��ʱ��
		// ���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ����⣺��������ٸ����ӣ�
		// ˼·����
		// ��������  = ÿ���һ������2/n + 1�� + ��������
		// ���򣬵�һ����һ������
		// �ڶ����У���һ������� + 1��* 2
		// �������� (�ڶ������� + 1) * 2
		T1 t = new T1();
		System.out.println(t.peech(10));
	}
}

class T1{
	public int peech(int n){
		if (n == 1) {
			return 1;
		}
		return (peech(n - 1) + 1) * 2;
	}
}