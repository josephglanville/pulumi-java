// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> getIpSetForwardedIpConfig() {
        return this.ipSetForwardedIpConfig == null ? Output.empty() : this.ipSetForwardedIpConfig;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs() {
        this.arn = Output.empty();
        this.ipSetForwardedIpConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = Output.ofNullable(ipSetForwardedIpConfig);
            return this;
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementArgs(arn, ipSetForwardedIpConfig);
        }
    }
}
