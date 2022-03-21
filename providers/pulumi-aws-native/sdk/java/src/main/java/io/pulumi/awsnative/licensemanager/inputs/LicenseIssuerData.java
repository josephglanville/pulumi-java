// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicenseIssuerData extends io.pulumi.resources.InvokeArgs {

    public static final LicenseIssuerData Empty = new LicenseIssuerData();

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="signKey")
      private final @Nullable String signKey;

    public Optional<String> getSignKey() {
        return this.signKey == null ? Optional.empty() : Optional.ofNullable(this.signKey);
    }

    public LicenseIssuerData(
        String name,
        @Nullable String signKey) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.signKey = signKey;
    }

    private LicenseIssuerData() {
        this.name = null;
        this.signKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseIssuerData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String signKey;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseIssuerData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.signKey = defaults.signKey;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder signKey(@Nullable String signKey) {
            this.signKey = signKey;
            return this;
        }        public LicenseIssuerData build() {
            return new LicenseIssuerData(name, signKey);
        }
    }
}
