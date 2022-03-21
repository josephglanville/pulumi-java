// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyIosSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyIosSettingsArgs Empty = new EnterpriseKeyIosSettingsArgs();

    /**
     * If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    @Import(name="allowAllBundleIds")
      private final @Nullable Output<Boolean> allowAllBundleIds;

    public Output<Boolean> getAllowAllBundleIds() {
        return this.allowAllBundleIds == null ? Output.empty() : this.allowAllBundleIds;
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
     */
    @Import(name="allowedBundleIds")
      private final @Nullable Output<List<String>> allowedBundleIds;

    public Output<List<String>> getAllowedBundleIds() {
        return this.allowedBundleIds == null ? Output.empty() : this.allowedBundleIds;
    }

    public EnterpriseKeyIosSettingsArgs(
        @Nullable Output<Boolean> allowAllBundleIds,
        @Nullable Output<List<String>> allowedBundleIds) {
        this.allowAllBundleIds = allowAllBundleIds;
        this.allowedBundleIds = allowedBundleIds;
    }

    private EnterpriseKeyIosSettingsArgs() {
        this.allowAllBundleIds = Output.empty();
        this.allowedBundleIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyIosSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAllBundleIds;
        private @Nullable Output<List<String>> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyIosSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowAllBundleIds(@Nullable Output<Boolean> allowAllBundleIds) {
            this.allowAllBundleIds = allowAllBundleIds;
            return this;
        }
        public Builder allowAllBundleIds(@Nullable Boolean allowAllBundleIds) {
            this.allowAllBundleIds = Output.ofNullable(allowAllBundleIds);
            return this;
        }
        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }
        public Builder allowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = Output.ofNullable(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public EnterpriseKeyIosSettingsArgs build() {
            return new EnterpriseKeyIosSettingsArgs(allowAllBundleIds, allowedBundleIds);
        }
    }
}
