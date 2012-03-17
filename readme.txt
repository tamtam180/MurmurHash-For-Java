以下のサイトのMurmurHashをJavaに移植したものです。
https://sites.google.com/site/murmurhash/
http://code.google.com/p/smhasher/

オリジナルと同じ結果を返す事は確認済です。
テストケースとして、
オリジナルのC++版で求めたハッシュ値をテストケースにして同じ値が返ることを確認しています。

Javaではunsginedな値を扱えないため、
正の数で扱いたい場合はEncodeUtilsを使って変換する必要があります。

手元にBigEndianのCPUがないため、LittleEndianでしか確認できていません(TxT)
