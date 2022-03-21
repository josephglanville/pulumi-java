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


public final class EnterpriseKeyAndroidSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyAndroidSettingsArgs Empty = new EnterpriseKeyAndroidSettingsArgs();

    /**
     * If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    @Import(name="allowAllPackageNames")
      private final @Nullable Output<Boolean> allowAllPackageNames;

    public Output<Boolean> getAllowAllPackageNames() {
        return this.allowAllPackageNames == null ? Output.empty() : this.allowAllPackageNames;
    }

    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
     */
    @Import(name="allowedPackageNames")
      private final @Nullable Output<List<String>> allowedPackageNames;

    public Output<List<String>> getAllowedPackageNames() {
        return this.allowedPackageNames == null ? Output.empty() : this.allowedPackageNames;
    }

    public EnterpriseKeyAndroidSettingsArgs(
        @Nullable Output<Boolean> allowAllPackageNames,
        @Nullable Output<List<String>> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    private EnterpriseKeyAndroidSettingsArgs() {
        this.allowAllPackageNames = Output.empty();
        this.allowedPackageNames = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyAndroidSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAllPackageNames;
        private @Nullable Output<List<String>> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyAndroidSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder allowAllPackageNames(@Nullable Output<Boolean> allowAllPackageNames) {
            this.allowAllPackageNames = allowAllPackageNames;
            return this;
        }
        public Builder allowAllPackageNames(@Nullable Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Output.ofNullable(allowAllPackageNames);
            return this;
        }
        public Builder allowedPackageNames(@Nullable Output<List<String>> allowedPackageNames) {
            this.allowedPackageNames = allowedPackageNames;
            return this;
        }
        public Builder allowedPackageNames(@Nullable List<String> allowedPackageNames) {
            this.allowedPackageNames = Output.ofNullable(allowedPackageNames);
            return this;
        }
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }        public EnterpriseKeyAndroidSettingsArgs build() {
            return new EnterpriseKeyAndroidSettingsArgs(allowAllPackageNames, allowedPackageNames);
        }
    }
}
