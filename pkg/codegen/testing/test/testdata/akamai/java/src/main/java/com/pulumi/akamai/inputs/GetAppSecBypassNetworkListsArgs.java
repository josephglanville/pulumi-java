// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecBypassNetworkListsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecBypassNetworkListsArgs Empty = new GetAppSecBypassNetworkListsArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecBypassNetworkListsArgs() {}

    private GetAppSecBypassNetworkListsArgs(GetAppSecBypassNetworkListsArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecBypassNetworkListsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecBypassNetworkListsArgs $;

        public Builder() {
            $ = new GetAppSecBypassNetworkListsArgs();
        }

        public Builder(GetAppSecBypassNetworkListsArgs defaults) {
            $ = new GetAppSecBypassNetworkListsArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecBypassNetworkListsArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecBypassNetworkListsArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecBypassNetworkListsArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
