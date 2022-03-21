// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DataSourceSslPropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSslPropertiesGetArgs Empty = new DataSourceSslPropertiesGetArgs();

    /**
     * A Boolean option to control whether SSL should be disabled.
     * 
     */
    @Import(name="disableSsl", required=true)
      private final Output<Boolean> disableSsl;

    public Output<Boolean> getDisableSsl() {
        return this.disableSsl;
    }

    public DataSourceSslPropertiesGetArgs(Output<Boolean> disableSsl) {
        this.disableSsl = Objects.requireNonNull(disableSsl, "expected parameter 'disableSsl' to be non-null");
    }

    private DataSourceSslPropertiesGetArgs() {
        this.disableSsl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSslPropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> disableSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSslPropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSsl = defaults.disableSsl;
        }

        public Builder disableSsl(Output<Boolean> disableSsl) {
            this.disableSsl = Objects.requireNonNull(disableSsl);
            return this;
        }
        public Builder disableSsl(Boolean disableSsl) {
            this.disableSsl = Output.of(Objects.requireNonNull(disableSsl));
            return this;
        }        public DataSourceSslPropertiesGetArgs build() {
            return new DataSourceSslPropertiesGetArgs(disableSsl);
        }
    }
}
