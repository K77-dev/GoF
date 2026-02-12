package _10_facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("💾 HardDrive: Lendo " + size + " bytes do setor " + lba);
        return new byte[size];
    }
}
