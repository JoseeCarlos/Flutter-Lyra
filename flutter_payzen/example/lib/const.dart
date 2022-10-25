abstract class DataSet {
  const DataSet();

  /// Your data set name
  String get name;

  /// Your payzen public key
  String get initialPublicKey;

  /// Your payzen api server name
  String get initialApiServerName;
}

class _FirstDataSet extends DataSet {
  const _FirstDataSet();

  /// Your data set name
  @override
  String get name => 'My First Instance Data Set';

  /// Your payzen public key
  @override
  String get initialPublicKey => '';

  /// Your payzen api server name
  @override
  String get initialApiServerName => '';
}

class DataSets {
  // ignore: library_private_types_in_public_api
  static DataSet get firstDataSet => const _FirstDataSet();
}
