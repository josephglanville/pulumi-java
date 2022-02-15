// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyAssociationResponse {
    private final String attachmentTarget;
    private final String displayName;
    private final String firewallPolicyId;
    private final String name;
    private final String shortName;

    @OutputCustomType.Constructor({"attachmentTarget","displayName","firewallPolicyId","name","shortName"})
    private FirewallPolicyAssociationResponse(
        String attachmentTarget,
        String displayName,
        String firewallPolicyId,
        String name,
        String shortName) {
        this.attachmentTarget = Objects.requireNonNull(attachmentTarget);
        this.displayName = Objects.requireNonNull(displayName);
        this.firewallPolicyId = Objects.requireNonNull(firewallPolicyId);
        this.name = Objects.requireNonNull(name);
        this.shortName = Objects.requireNonNull(shortName);
    }

    public String getAttachmentTarget() {
        return this.attachmentTarget;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }
    public String getName() {
        return this.name;
    }
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

        public Builder setAttachmentTarget(String attachmentTarget) {
            this.attachmentTarget = Objects.requireNonNull(attachmentTarget);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFirewallPolicyId(String firewallPolicyId) {
            this.firewallPolicyId = Objects.requireNonNull(firewallPolicyId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setShortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }

        public FirewallPolicyAssociationResponse build() {
            return new FirewallPolicyAssociationResponse(attachmentTarget, displayName, firewallPolicyId, name, shortName);
        }
    }
}