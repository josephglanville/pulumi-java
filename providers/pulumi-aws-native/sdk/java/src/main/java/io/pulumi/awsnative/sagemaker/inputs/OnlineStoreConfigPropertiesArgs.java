// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.FeatureGroupOnlineStoreSecurityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OnlineStoreConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnlineStoreConfigPropertiesArgs Empty = new OnlineStoreConfigPropertiesArgs();

    @Import(name="enableOnlineStore")
      private final @Nullable Output<Boolean> enableOnlineStore;

    public Output<Boolean> getEnableOnlineStore() {
        return this.enableOnlineStore == null ? Codegen.empty() : this.enableOnlineStore;
    }

    @Import(name="securityConfig")
      private final @Nullable Output<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig;

    public Output<FeatureGroupOnlineStoreSecurityConfigArgs> getSecurityConfig() {
        return this.securityConfig == null ? Codegen.empty() : this.securityConfig;
    }

    public OnlineStoreConfigPropertiesArgs(
        @Nullable Output<Boolean> enableOnlineStore,
        @Nullable Output<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig) {
        this.enableOnlineStore = enableOnlineStore;
        this.securityConfig = securityConfig;
    }

    private OnlineStoreConfigPropertiesArgs() {
        this.enableOnlineStore = Codegen.empty();
        this.securityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineStoreConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableOnlineStore;
        private @Nullable Output<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineStoreConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnlineStore = defaults.enableOnlineStore;
    	      this.securityConfig = defaults.securityConfig;
        }

        public Builder enableOnlineStore(@Nullable Output<Boolean> enableOnlineStore) {
            this.enableOnlineStore = enableOnlineStore;
            return this;
        }
        public Builder enableOnlineStore(@Nullable Boolean enableOnlineStore) {
            this.enableOnlineStore = Codegen.ofNullable(enableOnlineStore);
            return this;
        }
        public Builder securityConfig(@Nullable Output<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public Builder securityConfig(@Nullable FeatureGroupOnlineStoreSecurityConfigArgs securityConfig) {
            this.securityConfig = Codegen.ofNullable(securityConfig);
            return this;
        }        public OnlineStoreConfigPropertiesArgs build() {
            return new OnlineStoreConfigPropertiesArgs(enableOnlineStore, securityConfig);
        }
    }
}
