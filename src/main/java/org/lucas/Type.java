package org.lucas;
//https://linuxism.ustd.ip.or.kr/1523

import java.math.BigInteger;

// char => byte
// shor => word
// long => DWORD
// long long => QWORD
// long LONG
// _int64 LongLong
// _int64 ULongLong
public enum Type {
    BYTE, WORD, DWORD, QWORD, LONG, LONGLONG, ULONGLONG;

//    1byte
    public class BYTE {
        char val;

        public BYTE(char val) {
            this.val = val;
        }
    }
//    2byte
    public class WORD {
        short val;

        public WORD(short val) {
            this.val = val;
        }
    }
//    4byte
    public class DWORD {
        int val;

        public DWORD(int val) {
            this.val = val;
        }
    }
//    8byte
    public class QWROD {
        long val;

    public QWROD(long val) {
        this.val = val;
    }
}
    public class LONG {
        Long val;

        public LONG(Long val) {
            this.val = val;
        }
    }

}
