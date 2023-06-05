package org.lucas;

// char => byte
// shor => word
// long => DWORD
// long long => QWORD
// long LONG
// _int64 LongLong
// _int64 ULongLong

import org.lucas.Type.WORD;

public class winntdef {
    Type.WORD e_magic;
    Type.WORD   e_cblp;
    Type.WORD   e_cp;
    Type.WORD   e_crlc;
    Type.WORD   e_cparhdr;
    Type.WORD   e_minalloc;
    Type.WORD   e_maxalloc;
    Type.WORD   e_ss;
    Type.WORD   e_sp;
    Type.WORD   e_csum;
    Type.WORD   e_ip;
    Type.WORD   e_cs;
    Type.WORD   e_lfarlc;
    Type.WORD   e_ovno;
//    4
    Type.WORD[]   e_res = new WORD[4];
    Type.WORD   e_oemid;
    Type.WORD   e_oeminfo;
//    10
    Type.WORD[]   e_res2 = new WORD[10];
    Type.LONG   e_lfanew;
}

