// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSecurityGroupRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkSecurityGroupRuleResponse Empty = new NetworkSecurityGroupRuleResponse();

    @InputImport(name="access", required=true)
    private final String access;

    public String getAccess() {
        return this.access;
    }

    @InputImport(name="priority", required=true)
    private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    @InputImport(name="sourceAddressPrefix", required=true)
    private final String sourceAddressPrefix;

    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    @InputImport(name="sourcePortRanges")
    private final @Nullable List<String> sourcePortRanges;

    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public NetworkSecurityGroupRuleResponse(
        String access,
        Integer priority,
        String sourceAddressPrefix,
        @Nullable List<String> sourcePortRanges) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix, "expected parameter 'sourceAddressPrefix' to be non-null");
        this.sourcePortRanges = sourcePortRanges;
    }

    private NetworkSecurityGroupRuleResponse() {
        this.access = null;
        this.priority = null;
        this.sourceAddressPrefix = null;
        this.sourcePortRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private Integer priority;
        private String sourceAddressPrefix;
        private @Nullable List<String> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.priority = defaults.priority;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setSourceAddressPrefix(String sourceAddressPrefix) {
            this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
            return this;
        }

        public Builder setSourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public NetworkSecurityGroupRuleResponse build() {
            return new NetworkSecurityGroupRuleResponse(access, priority, sourceAddressPrefix, sourcePortRanges);
        }
    }
}
