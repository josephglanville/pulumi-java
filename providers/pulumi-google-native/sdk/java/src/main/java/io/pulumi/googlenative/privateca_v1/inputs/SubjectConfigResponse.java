// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectResponse;
import java.util.Objects;


public final class SubjectConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubjectConfigResponse Empty = new SubjectConfigResponse();

    @InputImport(name="subject", required=true)
    private final SubjectResponse subject;

    public SubjectResponse getSubject() {
        return this.subject;
    }

    @InputImport(name="subjectAltName", required=true)
    private final SubjectAltNamesResponse subjectAltName;

    public SubjectAltNamesResponse getSubjectAltName() {
        return this.subjectAltName;
    }

    public SubjectConfigResponse(
        SubjectResponse subject,
        SubjectAltNamesResponse subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = Objects.requireNonNull(subjectAltName, "expected parameter 'subjectAltName' to be non-null");
    }

    private SubjectConfigResponse() {
        this.subject = null;
        this.subjectAltName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setSubject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }

        public SubjectConfigResponse build() {
            return new SubjectConfigResponse(subject, subjectAltName);
        }
    }
}