// Autogenerated from Pigeon (v4.0.2), do not edit directly.
// See also: https://pub.dev/packages/pigeon
#import "info.h"
#import <Flutter/Flutter.h>

#if !__has_feature(objc_arc)
#error File requires ARC to be enabled.
#endif

static NSDictionary<NSString *, id> *wrapResult(id result, FlutterError *error) {
  NSDictionary *errorDict = (NSDictionary *)[NSNull null];
  if (error) {
    errorDict = @{
        @"code": (error.code ?: [NSNull null]),
        @"message": (error.message ?: [NSNull null]),
        @"details": (error.details ?: [NSNull null]),
        };
  }
  return @{
      @"result": (result ?: [NSNull null]),
      @"error": errorDict,
      };
}
static id GetNullableObject(NSDictionary* dict, id key) {
  id result = dict[key];
  return (result == [NSNull null]) ? nil : result;
}
static id GetNullableObjectAtIndex(NSArray* array, NSInteger key) {
  id result = array[key];
  return (result == [NSNull null]) ? nil : result;
}


@interface Infos ()
+ (Infos *)fromMap:(NSDictionary *)dict;
+ (nullable Infos *)nullableFromMap:(NSDictionary *)dict;
- (NSDictionary *)toMap;
@end

@implementation Infos
+ (instancetype)makeWithInfo1:(nullable NSString *)info1
    info2:(nullable NSString *)info2 {
  Infos* pigeonResult = [[Infos alloc] init];
  pigeonResult.info1 = info1;
  pigeonResult.info2 = info2;
  return pigeonResult;
}
+ (Infos *)fromMap:(NSDictionary *)dict {
  Infos *pigeonResult = [[Infos alloc] init];
  pigeonResult.info1 = GetNullableObject(dict, @"info1");
  pigeonResult.info2 = GetNullableObject(dict, @"info2");
  return pigeonResult;
}
+ (nullable Infos *)nullableFromMap:(NSDictionary *)dict { return (dict) ? [Infos fromMap:dict] : nil; }
- (NSDictionary *)toMap {
  return @{
    @"info1" : (self.info1 ?: [NSNull null]),
    @"info2" : (self.info2 ?: [NSNull null]),
  };
}
@end

@interface InfosApiCodecReader : FlutterStandardReader
@end
@implementation InfosApiCodecReader
- (nullable id)readValueOfType:(UInt8)type 
{
  switch (type) {
    case 128:     
      return [Infos fromMap:[self readValue]];
    
    default:    
      return [super readValueOfType:type];
    
  }
}
@end

@interface InfosApiCodecWriter : FlutterStandardWriter
@end
@implementation InfosApiCodecWriter
- (void)writeValue:(id)value 
{
  if ([value isKindOfClass:[Infos class]]) {
    [self writeByte:128];
    [self writeValue:[value toMap]];
  } else 
{
    [super writeValue:value];
  }
}
@end

@interface InfosApiCodecReaderWriter : FlutterStandardReaderWriter
@end
@implementation InfosApiCodecReaderWriter
- (FlutterStandardWriter *)writerWithData:(NSMutableData *)data {
  return [[InfosApiCodecWriter alloc] initWithData:data];
}
- (FlutterStandardReader *)readerWithData:(NSData *)data {
  return [[InfosApiCodecReader alloc] initWithData:data];
}
@end

NSObject<FlutterMessageCodec> *InfosApiGetCodec() {
  static dispatch_once_t sPred = 0;
  static FlutterStandardMessageCodec *sSharedObject = nil;
  dispatch_once(&sPred, ^{
    InfosApiCodecReaderWriter *readerWriter = [[InfosApiCodecReaderWriter alloc] init];
    sSharedObject = [FlutterStandardMessageCodec codecWithReaderWriter:readerWriter];
  });
  return sSharedObject;
}


void InfosApiSetup(id<FlutterBinaryMessenger> binaryMessenger, NSObject<InfosApi> *api) {
  {
    FlutterBasicMessageChannel *channel =
      [[FlutterBasicMessageChannel alloc]
        initWithName:@"dev.flutter.pigeon.InfosApi.search"
        binaryMessenger:binaryMessenger
        codec:InfosApiGetCodec()        ];
    if (api) {
      NSCAssert([api respondsToSelector:@selector(searchWithError:)], @"InfosApi api (%@) doesn't respond to @selector(searchWithError:)", api);
      [channel setMessageHandler:^(id _Nullable message, FlutterReply callback) {
        FlutterError *error;
        Infos *output = [api searchWithError:&error];
        callback(wrapResult(output, error));
      }];
    }
    else {
      [channel setMessageHandler:nil];
    }
  }
}
