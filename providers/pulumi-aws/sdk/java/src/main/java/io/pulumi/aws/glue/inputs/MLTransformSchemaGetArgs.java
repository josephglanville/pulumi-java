// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MLTransformSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLTransformSchemaGetArgs Empty = new MLTransformSchemaGetArgs();

    /**
     * The type of data in the column.
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Output.empty() : this.dataType;
    }

    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public MLTransformSchemaGetArgs(
        @Nullable Output<String> dataType,
        @Nullable Output<String> name) {
        this.dataType = dataType;
        this.name = name;
    }

    private MLTransformSchemaGetArgs() {
        this.dataType = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataType;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.name = defaults.name;
        }

        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = Output.ofNullable(dataType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public MLTransformSchemaGetArgs build() {
            return new MLTransformSchemaGetArgs(dataType, name);
        }
    }
}
