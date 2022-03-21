// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationIncrementalPullConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationIncrementalPullConfigArgs Empty = new IntegrationIncrementalPullConfigArgs();

    @Import(name="datetimeTypeFieldName")
      private final @Nullable Output<String> datetimeTypeFieldName;

    public Output<String> getDatetimeTypeFieldName() {
        return this.datetimeTypeFieldName == null ? Output.empty() : this.datetimeTypeFieldName;
    }

    public IntegrationIncrementalPullConfigArgs(@Nullable Output<String> datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    private IntegrationIncrementalPullConfigArgs() {
        this.datetimeTypeFieldName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationIncrementalPullConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationIncrementalPullConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder datetimeTypeFieldName(@Nullable Output<String> datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }
        public Builder datetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = Output.ofNullable(datetimeTypeFieldName);
            return this;
        }        public IntegrationIncrementalPullConfigArgs build() {
            return new IntegrationIncrementalPullConfigArgs(datetimeTypeFieldName);
        }
    }
}
