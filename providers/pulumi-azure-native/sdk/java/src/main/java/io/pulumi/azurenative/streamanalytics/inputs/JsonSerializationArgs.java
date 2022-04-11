// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.enums.Encoding;
import io.pulumi.azurenative.streamanalytics.enums.JsonOutputSerializationFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in JSON format.
 * 
 */
public final class JsonSerializationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonSerializationArgs Empty = new JsonSerializationArgs();

    /**
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<Either<String,Encoding>> encoding;

    public Output<Either<String,Encoding>> getEncoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    /**
     * This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new line and 'array' indicating the output will be formatted as an array of JSON objects. Default value is 'lineSeparated' if left null.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Either<String,JsonOutputSerializationFormat>> format;

    public Output<Either<String,JsonOutputSerializationFormat>> getFormat() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Json'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public JsonSerializationArgs(
        @Nullable Output<Either<String,Encoding>> encoding,
        @Nullable Output<Either<String,JsonOutputSerializationFormat>> format,
        Output<String> type) {
        this.encoding = encoding;
        this.format = format;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JsonSerializationArgs() {
        this.encoding = Codegen.empty();
        this.format = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Encoding>> encoding;
        private @Nullable Output<Either<String,JsonOutputSerializationFormat>> format;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonSerializationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
        }

        public Builder encoding(@Nullable Output<Either<String,Encoding>> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable Either<String,Encoding> encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder format(@Nullable Output<Either<String,JsonOutputSerializationFormat>> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable Either<String,JsonOutputSerializationFormat> format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public JsonSerializationArgs build() {
            return new JsonSerializationArgs(encoding, format, type);
        }
    }
}
