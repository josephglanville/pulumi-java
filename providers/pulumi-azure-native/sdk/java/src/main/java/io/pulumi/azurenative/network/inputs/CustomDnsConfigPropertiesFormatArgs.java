// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDnsConfigPropertiesFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDnsConfigPropertiesFormatArgs Empty = new CustomDnsConfigPropertiesFormatArgs();

    @InputImport(name="fqdn")
    private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    @InputImport(name="ipAddresses")
    private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    public CustomDnsConfigPropertiesFormatArgs(
        @Nullable Input<String> fqdn,
        @Nullable Input<List<String>> ipAddresses) {
        this.fqdn = fqdn;
        this.ipAddresses = ipAddresses;
    }

    private CustomDnsConfigPropertiesFormatArgs() {
        this.fqdn = Input.empty();
        this.ipAddresses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDnsConfigPropertiesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fqdn;
        private @Nullable Input<List<String>> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDnsConfigPropertiesFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }

        public CustomDnsConfigPropertiesFormatArgs build() {
            return new CustomDnsConfigPropertiesFormatArgs(fqdn, ipAddresses);
        }
    }
}
