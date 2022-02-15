// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadCertificatesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadCertificatesArgs Empty = new WorkloadCertificatesArgs();

    @InputImport(name="enableCertificates")
    private final @Nullable Input<Boolean> enableCertificates;

    public Input<Boolean> getEnableCertificates() {
        return this.enableCertificates == null ? Input.empty() : this.enableCertificates;
    }

    public WorkloadCertificatesArgs(@Nullable Input<Boolean> enableCertificates) {
        this.enableCertificates = enableCertificates;
    }

    private WorkloadCertificatesArgs() {
        this.enableCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadCertificatesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCertificates = defaults.enableCertificates;
        }

        public Builder setEnableCertificates(@Nullable Input<Boolean> enableCertificates) {
            this.enableCertificates = enableCertificates;
            return this;
        }

        public Builder setEnableCertificates(@Nullable Boolean enableCertificates) {
            this.enableCertificates = Input.ofNullable(enableCertificates);
            return this;
        }

        public WorkloadCertificatesArgs build() {
            return new WorkloadCertificatesArgs(enableCertificates);
        }
    }
}