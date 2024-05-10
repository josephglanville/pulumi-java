// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetCpsDeploymentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCpsDeploymentsPlainArgs Empty = new GetCpsDeploymentsPlainArgs();

    @Import(name="enrollmentId", required=true)
    private Integer enrollmentId;

    public Integer enrollmentId() {
        return this.enrollmentId;
    }

    private GetCpsDeploymentsPlainArgs() {}

    private GetCpsDeploymentsPlainArgs(GetCpsDeploymentsPlainArgs $) {
        this.enrollmentId = $.enrollmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCpsDeploymentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCpsDeploymentsPlainArgs $;

        public Builder() {
            $ = new GetCpsDeploymentsPlainArgs();
        }

        public Builder(GetCpsDeploymentsPlainArgs defaults) {
            $ = new GetCpsDeploymentsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder enrollmentId(Integer enrollmentId) {
            $.enrollmentId = enrollmentId;
            return this;
        }

        public GetCpsDeploymentsPlainArgs build() {
            if ($.enrollmentId == null) {
                throw new MissingRequiredPropertyException("GetCpsDeploymentsPlainArgs", "enrollmentId");
            }
            return $;
        }
    }

}
