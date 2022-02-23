// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceArgs Empty = new OccurenceArgs();

    /**
     * Occurrence that represents a single "attestation". The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * 
     */
    @InputImport(name="attestation", required=true)
      private final Input<OccurenceAttestationArgs> attestation;

    public Input<OccurenceAttestationArgs> getAttestation() {
        return this.attestation;
    }

    /**
     * The analysis note associated with this occurrence, in the form of
     * projects/[PROJECT]/notes/[NOTE_ID]. This field can be used as a
     * filter in list requests.
     * 
     */
    @InputImport(name="noteName", required=true)
      private final Input<String> noteName;

    public Input<String> getNoteName() {
        return this.noteName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @InputImport(name="remediation")
      private final @Nullable Input<String> remediation;

    public Input<String> getRemediation() {
        return this.remediation == null ? Input.empty() : this.remediation;
    }

    /**
     * Required. Immutable. A URI that represents the resource for which
     * the occurrence applies. For example,
     * https://gcr.io/project/image@sha256:123abc for a Docker image.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri;
    }

    public OccurenceArgs(
        Input<OccurenceAttestationArgs> attestation,
        Input<String> noteName,
        @Nullable Input<String> project,
        @Nullable Input<String> remediation,
        Input<String> resourceUri) {
        this.attestation = Objects.requireNonNull(attestation, "expected parameter 'attestation' to be non-null");
        this.noteName = Objects.requireNonNull(noteName, "expected parameter 'noteName' to be non-null");
        this.project = project;
        this.remediation = remediation;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private OccurenceArgs() {
        this.attestation = Input.empty();
        this.noteName = Input.empty();
        this.project = Input.empty();
        this.remediation = Input.empty();
        this.resourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OccurenceAttestationArgs> attestation;
        private Input<String> noteName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> remediation;
        private Input<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.noteName = defaults.noteName;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setAttestation(Input<OccurenceAttestationArgs> attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setAttestation(OccurenceAttestationArgs attestation) {
            this.attestation = Input.of(Objects.requireNonNull(attestation));
            return this;
        }

        public Builder setNoteName(Input<String> noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }

        public Builder setNoteName(String noteName) {
            this.noteName = Input.of(Objects.requireNonNull(noteName));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRemediation(@Nullable Input<String> remediation) {
            this.remediation = remediation;
            return this;
        }

        public Builder setRemediation(@Nullable String remediation) {
            this.remediation = Input.ofNullable(remediation);
            return this;
        }

        public Builder setResourceUri(Input<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }
        public OccurenceArgs build() {
            return new OccurenceArgs(attestation, noteName, project, remediation, resourceUri);
        }
    }
}
