// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyRuleApplicationProtocolResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationRuleResponse {
    /**
     * Description of the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * List of FQDN Tags for this rule.
     * 
     */
    private final @Nullable List<String> fqdnTags;
    /**
     * Name of the rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Array of Application Protocols.
     * 
     */
    private final @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols;
    /**
     * Rule Type.
     * Expected value is 'ApplicationRule'.
     * 
     */
    private final String ruleType;
    /**
     * List of source IP addresses for this rule.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * List of source IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;
    /**
     * List of FQDNs for this rule.
     * 
     */
    private final @Nullable List<String> targetFqdns;
    /**
     * List of Urls for this rule condition.
     * 
     */
    private final @Nullable List<String> targetUrls;
    /**
     * Terminate TLS connections for this rule.
     * 
     */
    private final @Nullable Boolean terminateTLS;
    /**
     * List of destination azure web categories.
     * 
     */
    private final @Nullable List<String> webCategories;

    @CustomType.Constructor
    private ApplicationRuleResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("fqdnTags") @Nullable List<String> fqdnTags,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("protocols") @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols,
        @CustomType.Parameter("ruleType") String ruleType,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups,
        @CustomType.Parameter("targetFqdns") @Nullable List<String> targetFqdns,
        @CustomType.Parameter("targetUrls") @Nullable List<String> targetUrls,
        @CustomType.Parameter("terminateTLS") @Nullable Boolean terminateTLS,
        @CustomType.Parameter("webCategories") @Nullable List<String> webCategories) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.ruleType = ruleType;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
        this.targetUrls = targetUrls;
        this.terminateTLS = terminateTLS;
        this.webCategories = webCategories;
    }

    /**
     * Description of the rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of destination IP addresses or Service Tags.
     * 
    */
    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * List of FQDN Tags for this rule.
     * 
    */
    public List<String> getFqdnTags() {
        return this.fqdnTags == null ? List.of() : this.fqdnTags;
    }
    /**
     * Name of the rule.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Array of Application Protocols.
     * 
    */
    public List<FirewallPolicyRuleApplicationProtocolResponse> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * Rule Type.
     * Expected value is 'ApplicationRule'.
     * 
    */
    public String getRuleType() {
        return this.ruleType;
    }
    /**
     * List of source IP addresses for this rule.
     * 
    */
    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * List of source IpGroups for this rule.
     * 
    */
    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }
    /**
     * List of FQDNs for this rule.
     * 
    */
    public List<String> getTargetFqdns() {
        return this.targetFqdns == null ? List.of() : this.targetFqdns;
    }
    /**
     * List of Urls for this rule condition.
     * 
    */
    public List<String> getTargetUrls() {
        return this.targetUrls == null ? List.of() : this.targetUrls;
    }
    /**
     * Terminate TLS connections for this rule.
     * 
    */
    public Optional<Boolean> getTerminateTLS() {
        return Optional.ofNullable(this.terminateTLS);
    }
    /**
     * List of destination azure web categories.
     * 
    */
    public List<String> getWebCategories() {
        return this.webCategories == null ? List.of() : this.webCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> fqdnTags;
        private @Nullable String name;
        private @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols;
        private String ruleType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable List<String> targetFqdns;
        private @Nullable List<String> targetUrls;
        private @Nullable Boolean terminateTLS;
        private @Nullable List<String> webCategories;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
    	      this.targetUrls = defaults.targetUrls;
    	      this.terminateTLS = defaults.terminateTLS;
    	      this.webCategories = defaults.webCategories;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }
        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocols(@Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(FirewallPolicyRuleApplicationProtocolResponse... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }
        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }
        public Builder targetUrls(@Nullable List<String> targetUrls) {
            this.targetUrls = targetUrls;
            return this;
        }
        public Builder targetUrls(String... targetUrls) {
            return targetUrls(List.of(targetUrls));
        }
        public Builder terminateTLS(@Nullable Boolean terminateTLS) {
            this.terminateTLS = terminateTLS;
            return this;
        }
        public Builder webCategories(@Nullable List<String> webCategories) {
            this.webCategories = webCategories;
            return this;
        }
        public Builder webCategories(String... webCategories) {
            return webCategories(List.of(webCategories));
        }        public ApplicationRuleResponse build() {
            return new ApplicationRuleResponse(description, destinationAddresses, fqdnTags, name, protocols, ruleType, sourceAddresses, sourceIpGroups, targetFqdns, targetUrls, terminateTLS, webCategories);
        }
    }
}
