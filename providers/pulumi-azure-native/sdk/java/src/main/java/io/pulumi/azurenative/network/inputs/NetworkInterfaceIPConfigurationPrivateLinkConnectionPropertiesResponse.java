// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * PrivateLinkConnection properties for the network interface.
 * 
 */
public final class NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse Empty = new NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse();

    /**
     * List of FQDNs for current private link connection.
     * 
     */
    @Import(name="fqdns", required=true)
      private final List<String> fqdns;

    public List<String> getFqdns() {
        return this.fqdns;
    }

    /**
     * The group ID for current private link connection.
     * 
     */
    @Import(name="groupId", required=true)
      private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The required member name for current private link connection.
     * 
     */
    @Import(name="requiredMemberName", required=true)
      private final String requiredMemberName;

    public String getRequiredMemberName() {
        return this.requiredMemberName;
    }

    public NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse(
        List<String> fqdns,
        String groupId,
        String requiredMemberName) {
        this.fqdns = Objects.requireNonNull(fqdns, "expected parameter 'fqdns' to be non-null");
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.requiredMemberName = Objects.requireNonNull(requiredMemberName, "expected parameter 'requiredMemberName' to be non-null");
    }

    private NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse() {
        this.fqdns = List.of();
        this.groupId = null;
        this.requiredMemberName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> fqdns;
        private String groupId;
        private String requiredMemberName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdns = defaults.fqdns;
    	      this.groupId = defaults.groupId;
    	      this.requiredMemberName = defaults.requiredMemberName;
        }

        public Builder fqdns(List<String> fqdns) {
            this.fqdns = Objects.requireNonNull(fqdns);
            return this;
        }
        public Builder fqdns(String... fqdns) {
            return fqdns(List.of(fqdns));
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder requiredMemberName(String requiredMemberName) {
            this.requiredMemberName = Objects.requireNonNull(requiredMemberName);
            return this;
        }        public NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse build() {
            return new NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse(fqdns, groupId, requiredMemberName);
        }
    }
}
