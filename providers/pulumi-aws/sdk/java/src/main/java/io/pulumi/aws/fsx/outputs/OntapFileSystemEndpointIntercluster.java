// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OntapFileSystemEndpointIntercluster {
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    private final @Nullable String dnsName;
    /**
     * IP addresses of the file system endpoint.
     * 
     */
    private final @Nullable List<String> ipAddresses;

    @OutputCustomType.Constructor
    private OntapFileSystemEndpointIntercluster(
        @OutputCustomType.Parameter("dnsName") @Nullable String dnsName,
        @OutputCustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses) {
        this.dnsName = dnsName;
        this.ipAddresses = ipAddresses;
    }

    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
    */
    public Optional<String> getDnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    /**
     * IP addresses of the file system endpoint.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointIntercluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsName;
        private @Nullable List<String> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpointIntercluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public OntapFileSystemEndpointIntercluster build() {
            return new OntapFileSystemEndpointIntercluster(dnsName, ipAddresses);
        }
    }
}
