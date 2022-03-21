// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectAltNamesArgs;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * These values are used to create the distinguished name and subject alternative name fields in an X.509 certificate.
 * 
 */
public final class SubjectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectConfigArgs Empty = new SubjectConfigArgs();

    /**
     * Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    @Import(name="subject", required=true)
      private final Output<SubjectArgs> subject;

    public Output<SubjectArgs> getSubject() {
        return this.subject;
    }

    /**
     * Optional. The subject alternative name fields.
     * 
     */
    @Import(name="subjectAltName")
      private final @Nullable Output<SubjectAltNamesArgs> subjectAltName;

    public Output<SubjectAltNamesArgs> getSubjectAltName() {
        return this.subjectAltName == null ? Output.empty() : this.subjectAltName;
    }

    public SubjectConfigArgs(
        Output<SubjectArgs> subject,
        @Nullable Output<SubjectAltNamesArgs> subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = subjectAltName;
    }

    private SubjectConfigArgs() {
        this.subject = Output.empty();
        this.subjectAltName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SubjectArgs> subject;
        private @Nullable Output<SubjectAltNamesArgs> subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(Output<SubjectArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subject(SubjectArgs subject) {
            this.subject = Output.of(Objects.requireNonNull(subject));
            return this;
        }
        public Builder subjectAltName(@Nullable Output<SubjectAltNamesArgs> subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }
        public Builder subjectAltName(@Nullable SubjectAltNamesArgs subjectAltName) {
            this.subjectAltName = Output.ofNullable(subjectAltName);
            return this;
        }        public SubjectConfigArgs build() {
            return new SubjectConfigArgs(subject, subjectAltName);
        }
    }
}
