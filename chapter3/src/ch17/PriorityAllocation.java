package ch17;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� call�� ���� �����´�");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�������õ��� ���� �������� ���� ����Ѵ�.");
	}

}
