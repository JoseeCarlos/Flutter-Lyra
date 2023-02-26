// Autogenerated from Pigeon (v7.0.4), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package tech.bam.flutter_lyra.android;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class LyraApi {
  @NonNull
  private static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<>(3);
    errorList.add(exception.toString());
    errorList.add(exception.getClass().getSimpleName());
    errorList.add(
      "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorList;
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class ErrorCodesInterface {
    private @NonNull String paymentCancelledByUser;

    public @NonNull String getPaymentCancelledByUser() {
      return paymentCancelledByUser;
    }

    public void setPaymentCancelledByUser(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"paymentCancelledByUser\" is null.");
      }
      this.paymentCancelledByUser = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private ErrorCodesInterface() {}

    public static final class Builder {

      private @Nullable String paymentCancelledByUser;

      public @NonNull Builder setPaymentCancelledByUser(@NonNull String setterArg) {
        this.paymentCancelledByUser = setterArg;
        return this;
      }

      public @NonNull ErrorCodesInterface build() {
        ErrorCodesInterface pigeonReturn = new ErrorCodesInterface();
        pigeonReturn.setPaymentCancelledByUser(paymentCancelledByUser);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(1);
      toListResult.add(paymentCancelledByUser);
      return toListResult;
    }

    static @NonNull ErrorCodesInterface fromList(@NonNull ArrayList<Object> list) {
      ErrorCodesInterface pigeonResult = new ErrorCodesInterface();
      Object paymentCancelledByUser = list.get(0);
      pigeonResult.setPaymentCancelledByUser((String) paymentCancelledByUser);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class LyraInitializeOptionsInterface {
    private @NonNull String apiServerName;

    public @NonNull String getApiServerName() {
      return apiServerName;
    }

    public void setApiServerName(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"apiServerName\" is null.");
      }
      this.apiServerName = setterArg;
    }

    private @Nullable Boolean nfcEnabled;

    public @Nullable Boolean getNfcEnabled() {
      return nfcEnabled;
    }

    public void setNfcEnabled(@Nullable Boolean setterArg) {
      this.nfcEnabled = setterArg;
    }

    private @Nullable Boolean cardScanningEnabled;

    public @Nullable Boolean getCardScanningEnabled() {
      return cardScanningEnabled;
    }

    public void setCardScanningEnabled(@Nullable Boolean setterArg) {
      this.cardScanningEnabled = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private LyraInitializeOptionsInterface() {}

    public static final class Builder {

      private @Nullable String apiServerName;

      public @NonNull Builder setApiServerName(@NonNull String setterArg) {
        this.apiServerName = setterArg;
        return this;
      }

      private @Nullable Boolean nfcEnabled;

      public @NonNull Builder setNfcEnabled(@Nullable Boolean setterArg) {
        this.nfcEnabled = setterArg;
        return this;
      }

      private @Nullable Boolean cardScanningEnabled;

      public @NonNull Builder setCardScanningEnabled(@Nullable Boolean setterArg) {
        this.cardScanningEnabled = setterArg;
        return this;
      }

      public @NonNull LyraInitializeOptionsInterface build() {
        LyraInitializeOptionsInterface pigeonReturn = new LyraInitializeOptionsInterface();
        pigeonReturn.setApiServerName(apiServerName);
        pigeonReturn.setNfcEnabled(nfcEnabled);
        pigeonReturn.setCardScanningEnabled(cardScanningEnabled);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(3);
      toListResult.add(apiServerName);
      toListResult.add(nfcEnabled);
      toListResult.add(cardScanningEnabled);
      return toListResult;
    }

    static @NonNull LyraInitializeOptionsInterface fromList(@NonNull ArrayList<Object> list) {
      LyraInitializeOptionsInterface pigeonResult = new LyraInitializeOptionsInterface();
      Object apiServerName = list.get(0);
      pigeonResult.setApiServerName((String) apiServerName);
      Object nfcEnabled = list.get(1);
      pigeonResult.setNfcEnabled((Boolean) nfcEnabled);
      Object cardScanningEnabled = list.get(2);
      pigeonResult.setCardScanningEnabled((Boolean) cardScanningEnabled);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class LyraKeyInterface {
    private @NonNull String publicKey;

    public @NonNull String getPublicKey() {
      return publicKey;
    }

    public void setPublicKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"publicKey\" is null.");
      }
      this.publicKey = setterArg;
    }

    private @NonNull LyraInitializeOptionsInterface options;

    public @NonNull LyraInitializeOptionsInterface getOptions() {
      return options;
    }

    public void setOptions(@NonNull LyraInitializeOptionsInterface setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"options\" is null.");
      }
      this.options = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private LyraKeyInterface() {}

    public static final class Builder {

      private @Nullable String publicKey;

      public @NonNull Builder setPublicKey(@NonNull String setterArg) {
        this.publicKey = setterArg;
        return this;
      }

      private @Nullable LyraInitializeOptionsInterface options;

      public @NonNull Builder setOptions(@NonNull LyraInitializeOptionsInterface setterArg) {
        this.options = setterArg;
        return this;
      }

      public @NonNull LyraKeyInterface build() {
        LyraKeyInterface pigeonReturn = new LyraKeyInterface();
        pigeonReturn.setPublicKey(publicKey);
        pigeonReturn.setOptions(options);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(publicKey);
      toListResult.add((options == null) ? null : options.toList());
      return toListResult;
    }

    static @NonNull LyraKeyInterface fromList(@NonNull ArrayList<Object> list) {
      LyraKeyInterface pigeonResult = new LyraKeyInterface();
      Object publicKey = list.get(0);
      pigeonResult.setPublicKey((String) publicKey);
      Object options = list.get(1);
      pigeonResult.setOptions((options == null) ? null : LyraInitializeOptionsInterface.fromList((ArrayList<Object>) options));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class ProcessRequestInterface {
    private @NonNull String formToken;

    public @NonNull String getFormToken() {
      return formToken;
    }

    public void setFormToken(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"formToken\" is null.");
      }
      this.formToken = setterArg;
    }

    private @NonNull ErrorCodesInterface errorCodes;

    public @NonNull ErrorCodesInterface getErrorCodes() {
      return errorCodes;
    }

    public void setErrorCodes(@NonNull ErrorCodesInterface setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"errorCodes\" is null.");
      }
      this.errorCodes = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private ProcessRequestInterface() {}

    public static final class Builder {

      private @Nullable String formToken;

      public @NonNull Builder setFormToken(@NonNull String setterArg) {
        this.formToken = setterArg;
        return this;
      }

      private @Nullable ErrorCodesInterface errorCodes;

      public @NonNull Builder setErrorCodes(@NonNull ErrorCodesInterface setterArg) {
        this.errorCodes = setterArg;
        return this;
      }

      public @NonNull ProcessRequestInterface build() {
        ProcessRequestInterface pigeonReturn = new ProcessRequestInterface();
        pigeonReturn.setFormToken(formToken);
        pigeonReturn.setErrorCodes(errorCodes);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(formToken);
      toListResult.add((errorCodes == null) ? null : errorCodes.toList());
      return toListResult;
    }

    static @NonNull ProcessRequestInterface fromList(@NonNull ArrayList<Object> list) {
      ProcessRequestInterface pigeonResult = new ProcessRequestInterface();
      Object formToken = list.get(0);
      pigeonResult.setFormToken((String) formToken);
      Object errorCodes = list.get(1);
      pigeonResult.setErrorCodes((errorCodes == null) ? null : ErrorCodesInterface.fromList((ArrayList<Object>) errorCodes));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);

    void error(Throwable error);
  }

  private static class LyraHostApiCodec extends StandardMessageCodec {
    public static final LyraHostApiCodec INSTANCE = new LyraHostApiCodec();

    private LyraHostApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return ErrorCodesInterface.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return LyraInitializeOptionsInterface.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return LyraKeyInterface.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 131:
          return ProcessRequestInterface.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof ErrorCodesInterface) {
        stream.write(128);
        writeValue(stream, ((ErrorCodesInterface) value).toList());
      } else if (value instanceof LyraInitializeOptionsInterface) {
        stream.write(129);
        writeValue(stream, ((LyraInitializeOptionsInterface) value).toList());
      } else if (value instanceof LyraKeyInterface) {
        stream.write(130);
        writeValue(stream, ((LyraKeyInterface) value).toList());
      } else if (value instanceof ProcessRequestInterface) {
        stream.write(131);
        writeValue(stream, ((ProcessRequestInterface) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface LyraHostApi {

    void initialize(@NonNull LyraKeyInterface lyraKey, Result<LyraKeyInterface> result);

    void getFormTokenVersion(Result<Long> result);

    void process(@NonNull ProcessRequestInterface request, Result<String> result);

    void cancelProcess(Result<Void> result);

    /** The codec used by LyraHostApi. */
    static MessageCodec<Object> getCodec() {
      return LyraHostApiCodec.INSTANCE;
    }
    /**Sets up an instance of `LyraHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, LyraHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.LyraHostApi.initialize", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList wrapped = new ArrayList<>();
                try {
                  ArrayList<Object> args = (ArrayList<Object>) message;
                  assert args != null;
                  LyraKeyInterface lyraKeyArg = (LyraKeyInterface) args.get(0);
                  if (lyraKeyArg == null) {
                    throw new NullPointerException("lyraKeyArg unexpectedly null.");
                  }
                  Result<LyraKeyInterface> resultCallback = 
                      new Result<LyraKeyInterface>() {
                        public void success(LyraKeyInterface result) {
                          wrapped.add(0, result);
                          reply.reply(wrapped);
                        }

                        public void error(Throwable error) {
                          ArrayList<Object> wrappedError = wrapError(error);
                          reply.reply(wrappedError);
                        }
                      };

                  api.initialize(lyraKeyArg, resultCallback);
                } catch (Error | RuntimeException exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  reply.reply(wrappedError);
                }
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.LyraHostApi.getFormTokenVersion", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList wrapped = new ArrayList<>();
                try {
                  Result<Long> resultCallback = 
                      new Result<Long>() {
                        public void success(Long result) {
                          wrapped.add(0, result);
                          reply.reply(wrapped);
                        }

                        public void error(Throwable error) {
                          ArrayList<Object> wrappedError = wrapError(error);
                          reply.reply(wrappedError);
                        }
                      };

                  api.getFormTokenVersion(resultCallback);
                } catch (Error | RuntimeException exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  reply.reply(wrappedError);
                }
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.LyraHostApi.process", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList wrapped = new ArrayList<>();
                try {
                  ArrayList<Object> args = (ArrayList<Object>) message;
                  assert args != null;
                  ProcessRequestInterface requestArg = (ProcessRequestInterface) args.get(0);
                  if (requestArg == null) {
                    throw new NullPointerException("requestArg unexpectedly null.");
                  }
                  Result<String> resultCallback = 
                      new Result<String>() {
                        public void success(String result) {
                          wrapped.add(0, result);
                          reply.reply(wrapped);
                        }

                        public void error(Throwable error) {
                          ArrayList<Object> wrappedError = wrapError(error);
                          reply.reply(wrappedError);
                        }
                      };

                  api.process(requestArg, resultCallback);
                } catch (Error | RuntimeException exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  reply.reply(wrappedError);
                }
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.LyraHostApi.cancelProcess", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList wrapped = new ArrayList<>();
                try {
                  Result<Void> resultCallback = 
                      new Result<Void>() {
                        public void success(Void result) {
                          wrapped.add(0, null);
                          reply.reply(wrapped);
                        }

                        public void error(Throwable error) {
                          ArrayList<Object> wrappedError = wrapError(error);
                          reply.reply(wrappedError);
                        }
                      };

                  api.cancelProcess(resultCallback);
                } catch (Error | RuntimeException exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  reply.reply(wrappedError);
                }
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}
