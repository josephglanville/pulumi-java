// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

    @OutputCustomType.Constructor
    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("ipSetForwardedIpConfig") @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
        this.arn = arn;
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig> getIpSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setIpSetForwardedIpConfig(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement(arn, ipSetForwardedIpConfig);
        }
    }
}
