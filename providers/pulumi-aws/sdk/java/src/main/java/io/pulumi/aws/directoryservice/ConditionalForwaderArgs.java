// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConditionalForwaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionalForwaderArgs Empty = new ConditionalForwaderArgs();

    /**
     * The id of directory.
     * 
     */
    @Import(name="directoryId", required=true)
      private final Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId;
    }

    /**
     * A list of forwarder IP addresses.
     * 
     */
    @Import(name="dnsIps", required=true)
      private final Output<List<String>> dnsIps;

    public Output<List<String>> getDnsIps() {
        return this.dnsIps;
    }

    /**
     * The fully qualified domain name of the remote domain for which forwarders will be used.
     * 
     */
    @Import(name="remoteDomainName", required=true)
      private final Output<String> remoteDomainName;

    public Output<String> getRemoteDomainName() {
        return this.remoteDomainName;
    }

    public ConditionalForwaderArgs(
        Output<String> directoryId,
        Output<List<String>> dnsIps,
        Output<String> remoteDomainName) {
        this.directoryId = Objects.requireNonNull(directoryId, "expected parameter 'directoryId' to be non-null");
        this.dnsIps = Objects.requireNonNull(dnsIps, "expected parameter 'dnsIps' to be non-null");
        this.remoteDomainName = Objects.requireNonNull(remoteDomainName, "expected parameter 'remoteDomainName' to be non-null");
    }

    private ConditionalForwaderArgs() {
        this.directoryId = Output.empty();
        this.dnsIps = Output.empty();
        this.remoteDomainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionalForwaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> directoryId;
        private Output<List<String>> dnsIps;
        private Output<String> remoteDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionalForwaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryId = defaults.directoryId;
    	      this.dnsIps = defaults.dnsIps;
    	      this.remoteDomainName = defaults.remoteDomainName;
        }

        public Builder directoryId(Output<String> directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public Builder directoryId(String directoryId) {
            this.directoryId = Output.of(Objects.requireNonNull(directoryId));
            return this;
        }
        public Builder dnsIps(Output<List<String>> dnsIps) {
            this.dnsIps = Objects.requireNonNull(dnsIps);
            return this;
        }
        public Builder dnsIps(List<String> dnsIps) {
            this.dnsIps = Output.of(Objects.requireNonNull(dnsIps));
            return this;
        }
        public Builder dnsIps(String... dnsIps) {
            return dnsIps(List.of(dnsIps));
        }
        public Builder remoteDomainName(Output<String> remoteDomainName) {
            this.remoteDomainName = Objects.requireNonNull(remoteDomainName);
            return this;
        }
        public Builder remoteDomainName(String remoteDomainName) {
            this.remoteDomainName = Output.of(Objects.requireNonNull(remoteDomainName));
            return this;
        }        public ConditionalForwaderArgs build() {
            return new ConditionalForwaderArgs(directoryId, dnsIps, remoteDomainName);
        }
    }
}