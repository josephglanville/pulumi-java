// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyAssociationResponse {
    /**
     * The target that the firewall policy is attached to.
     * 
     */
    private final String attachmentTarget;
    /**
     * Deprecated, please use short name instead. The display name of the firewall policy of the association.
     * 
     */
    private final String displayName;
    /**
     * The firewall policy ID of the association.
     * 
     */
    private final String firewallPolicyId;
    /**
     * The name for an association.
     * 
     */
    private final String name;
    /**
     * The short name of the firewall policy of the association.
     * 
     */
    private final String shortName;

    @CustomType.Constructor
    private FirewallPolicyAssociationResponse(
        @CustomType.Parameter("attachmentTarget") String attachmentTarget,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("firewallPolicyId") String firewallPolicyId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("shortName") String shortName) {
        this.attachmentTarget = attachmentTarget;
        this.displayName = displayName;
        this.firewallPolicyId = firewallPolicyId;
        this.name = name;
        this.shortName = shortName;
    }

    /**
     * The target that the firewall policy is attached to.
     * 
    */
    public String getAttachmentTarget() {
        return this.attachmentTarget;
    }
    /**
     * Deprecated, please use short name instead. The display name of the firewall policy of the association.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The firewall policy ID of the association.
     * 
    */
    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }
    /**
     * The name for an association.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The short name of the firewall policy of the association.
     * 
    */
    public String getShortName() {
        return this.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentTarget;
        private String displayName;
        private String firewallPolicyId;
        private String name;
        private String shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentTarget = defaults.attachmentTarget;
    	      this.displayName = defaults.displayName;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.name = defaults.name;
    	      this.shortName = defaults.shortName;
        }

        public Builder attachmentTarget(String attachmentTarget) {
            this.attachmentTarget = Objects.requireNonNull(attachmentTarget);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder firewallPolicyId(String firewallPolicyId) {
            this.firewallPolicyId = Objects.requireNonNull(firewallPolicyId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }        public FirewallPolicyAssociationResponse build() {
            return new FirewallPolicyAssociationResponse(attachmentTarget, displayName, firewallPolicyId, name, shortName);
        }
    }
}
