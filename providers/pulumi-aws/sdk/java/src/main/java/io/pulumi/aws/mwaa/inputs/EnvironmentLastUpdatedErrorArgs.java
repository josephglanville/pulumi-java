// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLastUpdatedErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLastUpdatedErrorArgs Empty = new EnvironmentLastUpdatedErrorArgs();

    @Import(name="errorCode")
      private final @Nullable Output<String> errorCode;

    public Output<String> getErrorCode() {
        return this.errorCode == null ? Output.empty() : this.errorCode;
    }

    @Import(name="errorMessage")
      private final @Nullable Output<String> errorMessage;

    public Output<String> getErrorMessage() {
        return this.errorMessage == null ? Output.empty() : this.errorMessage;
    }

    public EnvironmentLastUpdatedErrorArgs(
        @Nullable Output<String> errorCode,
        @Nullable Output<String> errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private EnvironmentLastUpdatedErrorArgs() {
        this.errorCode = Output.empty();
        this.errorMessage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLastUpdatedErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> errorCode;
        private @Nullable Output<String> errorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLastUpdatedErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
        }

        public Builder errorCode(@Nullable Output<String> errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Builder errorCode(@Nullable String errorCode) {
            this.errorCode = Output.ofNullable(errorCode);
            return this;
        }
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = Output.ofNullable(errorMessage);
            return this;
        }        public EnvironmentLastUpdatedErrorArgs build() {
            return new EnvironmentLastUpdatedErrorArgs(errorCode, errorMessage);
        }
    }
}