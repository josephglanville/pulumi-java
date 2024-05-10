// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetCPSEnrollmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCPSEnrollmentPlainArgs Empty = new GetCPSEnrollmentPlainArgs();

    @Import(name="enrollmentId", required=true)
    private Integer enrollmentId;

    public Integer enrollmentId() {
        return this.enrollmentId;
    }

    private GetCPSEnrollmentPlainArgs() {}

    private GetCPSEnrollmentPlainArgs(GetCPSEnrollmentPlainArgs $) {
        this.enrollmentId = $.enrollmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCPSEnrollmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCPSEnrollmentPlainArgs $;

        public Builder() {
            $ = new GetCPSEnrollmentPlainArgs();
        }

        public Builder(GetCPSEnrollmentPlainArgs defaults) {
            $ = new GetCPSEnrollmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder enrollmentId(Integer enrollmentId) {
            $.enrollmentId = enrollmentId;
            return this;
        }

        public GetCPSEnrollmentPlainArgs build() {
            if ($.enrollmentId == null) {
                throw new MissingRequiredPropertyException("GetCPSEnrollmentPlainArgs", "enrollmentId");
            }
            return $;
        }
    }

}
