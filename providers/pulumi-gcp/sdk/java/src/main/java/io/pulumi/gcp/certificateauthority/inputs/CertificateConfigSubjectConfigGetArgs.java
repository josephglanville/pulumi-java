// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectAltNameGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigSubjectConfigGetArgs Empty = new CertificateConfigSubjectConfigGetArgs();

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    @Import(name="subject", required=true)
      private final Output<CertificateConfigSubjectConfigSubjectGetArgs> subject;

    public Output<CertificateConfigSubjectConfigSubjectGetArgs> getSubject() {
        return this.subject;
    }

    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    @Import(name="subjectAltName")
      private final @Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName;

    public Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> getSubjectAltName() {
        return this.subjectAltName == null ? Codegen.empty() : this.subjectAltName;
    }

    public CertificateConfigSubjectConfigGetArgs(
        Output<CertificateConfigSubjectConfigSubjectGetArgs> subject,
        @Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = subjectAltName;
    }

    private CertificateConfigSubjectConfigGetArgs() {
        this.subject = Codegen.empty();
        this.subjectAltName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigSubjectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CertificateConfigSubjectConfigSubjectGetArgs> subject;
        private @Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigSubjectConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(Output<CertificateConfigSubjectConfigSubjectGetArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subject(CertificateConfigSubjectConfigSubjectGetArgs subject) {
            this.subject = Output.of(Objects.requireNonNull(subject));
            return this;
        }
        public Builder subjectAltName(@Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }
        public Builder subjectAltName(@Nullable CertificateConfigSubjectConfigSubjectAltNameGetArgs subjectAltName) {
            this.subjectAltName = Codegen.ofNullable(subjectAltName);
            return this;
        }        public CertificateConfigSubjectConfigGetArgs build() {
            return new CertificateConfigSubjectConfigGetArgs(subject, subjectAltName);
        }
    }
}
