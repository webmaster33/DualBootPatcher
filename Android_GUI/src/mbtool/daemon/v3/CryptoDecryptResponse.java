// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CryptoDecryptResponse extends Table {
  public static CryptoDecryptResponse getRootAsCryptoDecryptResponse(ByteBuffer _bb) { return getRootAsCryptoDecryptResponse(_bb, new CryptoDecryptResponse()); }
  public static CryptoDecryptResponse getRootAsCryptoDecryptResponse(ByteBuffer _bb, CryptoDecryptResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public CryptoDecryptResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startCryptoDecryptResponse(FlatBufferBuilder builder) { builder.startObject(1); }
  public static int endCryptoDecryptResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

