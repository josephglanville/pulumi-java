// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Signed Access Approvals (SAA) enrollment response.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse Empty = new GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse();

    /**
     * Indicates SAA enrollment setup error if any.
     * 
     */
    @Import(name="setupErrors", required=true)
      private final List<String> setupErrors;

    public List<String> getSetupErrors() {
        return this.setupErrors;
    }

    /**
     * Indicates SAA enrollment status of a given workload.
     * 
     */
    @Import(name="setupStatus", required=true)
      private final String setupStatus;

    public String getSetupStatus() {
        return this.setupStatus;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse(
        List<String> setupErrors,
        String setupStatus) {
        this.setupErrors = Objects.requireNonNull(setupErrors, "expected parameter 'setupErrors' to be non-null");
        this.setupStatus = Objects.requireNonNull(setupStatus, "expected parameter 'setupStatus' to be non-null");
    }

    private GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse() {
        this.setupErrors = List.of();
        this.setupStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> setupErrors;
        private String setupStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.setupErrors = defaults.setupErrors;
    	      this.setupStatus = defaults.setupStatus;
        }

        public Builder setupErrors(List<String> setupErrors) {
            this.setupErrors = Objects.requireNonNull(setupErrors);
            return this;
        }
        public Builder setupErrors(String... setupErrors) {
            return setupErrors(List.of(setupErrors));
        }
        public Builder setupStatus(String setupStatus) {
            this.setupStatus = Objects.requireNonNull(setupStatus);
            return this;
        }        public GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse(setupErrors, setupStatus);
        }
    }
}
