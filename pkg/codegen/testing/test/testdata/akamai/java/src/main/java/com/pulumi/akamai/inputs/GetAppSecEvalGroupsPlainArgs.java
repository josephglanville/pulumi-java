// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecEvalGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecEvalGroupsPlainArgs Empty = new GetAppSecEvalGroupsPlainArgs();

    @Import(name="attackGroup")
    private @Nullable String attackGroup;

    public Optional<String> attackGroup() {
        return Optional.ofNullable(this.attackGroup);
    }

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecEvalGroupsPlainArgs() {}

    private GetAppSecEvalGroupsPlainArgs(GetAppSecEvalGroupsPlainArgs $) {
        this.attackGroup = $.attackGroup;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecEvalGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecEvalGroupsPlainArgs $;

        public Builder() {
            $ = new GetAppSecEvalGroupsPlainArgs();
        }

        public Builder(GetAppSecEvalGroupsPlainArgs defaults) {
            $ = new GetAppSecEvalGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder attackGroup(@Nullable String attackGroup) {
            $.attackGroup = attackGroup;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecEvalGroupsPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalGroupsPlainArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalGroupsPlainArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
