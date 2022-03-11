// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobDestinationGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobRevocationRecordGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobSignedObjectGetArgs;
import io.pulumi.aws.signer.inputs.SigningJobSourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobState extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobState Empty = new SigningJobState();

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
     */
    @InputImport(name="completedAt")
      private final @Nullable Output<String> completedAt;

    public Output<String> getCompletedAt() {
        return this.completedAt == null ? Output.empty() : this.completedAt;
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
     */
    @InputImport(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Output.empty() : this.createdAt;
    }

    /**
     * The S3 bucket in which to save your signed object. See Destination below for details.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Output<SigningJobDestinationGetArgs> destination;

    public Output<SigningJobDestinationGetArgs> getDestination() {
        return this.destination == null ? Output.empty() : this.destination;
    }

    /**
     * Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
     * 
     */
    @InputImport(name="ignoreSigningJobFailure")
      private final @Nullable Output<Boolean> ignoreSigningJobFailure;

    public Output<Boolean> getIgnoreSigningJobFailure() {
        return this.ignoreSigningJobFailure == null ? Output.empty() : this.ignoreSigningJobFailure;
    }

    /**
     * The ID of the signing job on output.
     * 
     */
    @InputImport(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId == null ? Output.empty() : this.jobId;
    }

    /**
     * The IAM entity that initiated the signing job.
     * 
     */
    @InputImport(name="jobInvoker")
      private final @Nullable Output<String> jobInvoker;

    public Output<String> getJobInvoker() {
        return this.jobInvoker == null ? Output.empty() : this.jobInvoker;
    }

    /**
     * The AWS account ID of the job owner.
     * 
     */
    @InputImport(name="jobOwner")
      private final @Nullable Output<String> jobOwner;

    public Output<String> getJobOwner() {
        return this.jobOwner == null ? Output.empty() : this.jobOwner;
    }

    /**
     * A human-readable name for the signing platform associated with the signing job.
     * 
     */
    @InputImport(name="platformDisplayName")
      private final @Nullable Output<String> platformDisplayName;

    public Output<String> getPlatformDisplayName() {
        return this.platformDisplayName == null ? Output.empty() : this.platformDisplayName;
    }

    /**
     * The platform to which your signed code image will be distributed.
     * 
     */
    @InputImport(name="platformId")
      private final @Nullable Output<String> platformId;

    public Output<String> getPlatformId() {
        return this.platformId == null ? Output.empty() : this.platformId;
    }

    /**
     * The name of the profile to initiate the signing operation.
     * 
     */
    @InputImport(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName == null ? Output.empty() : this.profileName;
    }

    /**
     * The version of the signing profile used to initiate the signing job.
     * 
     */
    @InputImport(name="profileVersion")
      private final @Nullable Output<String> profileVersion;

    public Output<String> getProfileVersion() {
        return this.profileVersion == null ? Output.empty() : this.profileVersion;
    }

    /**
     * The IAM principal that requested the signing job.
     * 
     */
    @InputImport(name="requestedBy")
      private final @Nullable Output<String> requestedBy;

    public Output<String> getRequestedBy() {
        return this.requestedBy == null ? Output.empty() : this.requestedBy;
    }

    /**
     * A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
     */
    @InputImport(name="revocationRecords")
      private final @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords;

    public Output<List<SigningJobRevocationRecordGetArgs>> getRevocationRecords() {
        return this.revocationRecords == null ? Output.empty() : this.revocationRecords;
    }

    /**
     * The time when the signature of a signing job expires.
     * 
     */
    @InputImport(name="signatureExpiresAt")
      private final @Nullable Output<String> signatureExpiresAt;

    public Output<String> getSignatureExpiresAt() {
        return this.signatureExpiresAt == null ? Output.empty() : this.signatureExpiresAt;
    }

    /**
     * Name of the S3 bucket where the signed code image is saved by code signing.
     * 
     */
    @InputImport(name="signedObjects")
      private final @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects;

    public Output<List<SigningJobSignedObjectGetArgs>> getSignedObjects() {
        return this.signedObjects == null ? Output.empty() : this.signedObjects;
    }

    /**
     * The S3 bucket that contains the object to sign. See Source below for details.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Output<SigningJobSourceGetArgs> source;

    public Output<SigningJobSourceGetArgs> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * Status of the signing job.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * String value that contains the status reason.
     * 
     */
    @InputImport(name="statusReason")
      private final @Nullable Output<String> statusReason;

    public Output<String> getStatusReason() {
        return this.statusReason == null ? Output.empty() : this.statusReason;
    }

    public SigningJobState(
        @Nullable Output<String> completedAt,
        @Nullable Output<String> createdAt,
        @Nullable Output<SigningJobDestinationGetArgs> destination,
        @Nullable Output<Boolean> ignoreSigningJobFailure,
        @Nullable Output<String> jobId,
        @Nullable Output<String> jobInvoker,
        @Nullable Output<String> jobOwner,
        @Nullable Output<String> platformDisplayName,
        @Nullable Output<String> platformId,
        @Nullable Output<String> profileName,
        @Nullable Output<String> profileVersion,
        @Nullable Output<String> requestedBy,
        @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords,
        @Nullable Output<String> signatureExpiresAt,
        @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects,
        @Nullable Output<SigningJobSourceGetArgs> source,
        @Nullable Output<String> status,
        @Nullable Output<String> statusReason) {
        this.completedAt = completedAt;
        this.createdAt = createdAt;
        this.destination = destination;
        this.ignoreSigningJobFailure = ignoreSigningJobFailure;
        this.jobId = jobId;
        this.jobInvoker = jobInvoker;
        this.jobOwner = jobOwner;
        this.platformDisplayName = platformDisplayName;
        this.platformId = platformId;
        this.profileName = profileName;
        this.profileVersion = profileVersion;
        this.requestedBy = requestedBy;
        this.revocationRecords = revocationRecords;
        this.signatureExpiresAt = signatureExpiresAt;
        this.signedObjects = signedObjects;
        this.source = source;
        this.status = status;
        this.statusReason = statusReason;
    }

    private SigningJobState() {
        this.completedAt = Output.empty();
        this.createdAt = Output.empty();
        this.destination = Output.empty();
        this.ignoreSigningJobFailure = Output.empty();
        this.jobId = Output.empty();
        this.jobInvoker = Output.empty();
        this.jobOwner = Output.empty();
        this.platformDisplayName = Output.empty();
        this.platformId = Output.empty();
        this.profileName = Output.empty();
        this.profileVersion = Output.empty();
        this.requestedBy = Output.empty();
        this.revocationRecords = Output.empty();
        this.signatureExpiresAt = Output.empty();
        this.signedObjects = Output.empty();
        this.source = Output.empty();
        this.status = Output.empty();
        this.statusReason = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> completedAt;
        private @Nullable Output<String> createdAt;
        private @Nullable Output<SigningJobDestinationGetArgs> destination;
        private @Nullable Output<Boolean> ignoreSigningJobFailure;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> jobInvoker;
        private @Nullable Output<String> jobOwner;
        private @Nullable Output<String> platformDisplayName;
        private @Nullable Output<String> platformId;
        private @Nullable Output<String> profileName;
        private @Nullable Output<String> profileVersion;
        private @Nullable Output<String> requestedBy;
        private @Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords;
        private @Nullable Output<String> signatureExpiresAt;
        private @Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects;
        private @Nullable Output<SigningJobSourceGetArgs> source;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedAt = defaults.completedAt;
    	      this.createdAt = defaults.createdAt;
    	      this.destination = defaults.destination;
    	      this.ignoreSigningJobFailure = defaults.ignoreSigningJobFailure;
    	      this.jobId = defaults.jobId;
    	      this.jobInvoker = defaults.jobInvoker;
    	      this.jobOwner = defaults.jobOwner;
    	      this.platformDisplayName = defaults.platformDisplayName;
    	      this.platformId = defaults.platformId;
    	      this.profileName = defaults.profileName;
    	      this.profileVersion = defaults.profileVersion;
    	      this.requestedBy = defaults.requestedBy;
    	      this.revocationRecords = defaults.revocationRecords;
    	      this.signatureExpiresAt = defaults.signatureExpiresAt;
    	      this.signedObjects = defaults.signedObjects;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder completedAt(@Nullable Output<String> completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        public Builder completedAt(@Nullable String completedAt) {
            this.completedAt = Output.ofNullable(completedAt);
            return this;
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Output.ofNullable(createdAt);
            return this;
        }

        public Builder destination(@Nullable Output<SigningJobDestinationGetArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable SigningJobDestinationGetArgs destination) {
            this.destination = Output.ofNullable(destination);
            return this;
        }

        public Builder ignoreSigningJobFailure(@Nullable Output<Boolean> ignoreSigningJobFailure) {
            this.ignoreSigningJobFailure = ignoreSigningJobFailure;
            return this;
        }

        public Builder ignoreSigningJobFailure(@Nullable Boolean ignoreSigningJobFailure) {
            this.ignoreSigningJobFailure = Output.ofNullable(ignoreSigningJobFailure);
            return this;
        }

        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder jobId(@Nullable String jobId) {
            this.jobId = Output.ofNullable(jobId);
            return this;
        }

        public Builder jobInvoker(@Nullable Output<String> jobInvoker) {
            this.jobInvoker = jobInvoker;
            return this;
        }

        public Builder jobInvoker(@Nullable String jobInvoker) {
            this.jobInvoker = Output.ofNullable(jobInvoker);
            return this;
        }

        public Builder jobOwner(@Nullable Output<String> jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }

        public Builder jobOwner(@Nullable String jobOwner) {
            this.jobOwner = Output.ofNullable(jobOwner);
            return this;
        }

        public Builder platformDisplayName(@Nullable Output<String> platformDisplayName) {
            this.platformDisplayName = platformDisplayName;
            return this;
        }

        public Builder platformDisplayName(@Nullable String platformDisplayName) {
            this.platformDisplayName = Output.ofNullable(platformDisplayName);
            return this;
        }

        public Builder platformId(@Nullable Output<String> platformId) {
            this.platformId = platformId;
            return this;
        }

        public Builder platformId(@Nullable String platformId) {
            this.platformId = Output.ofNullable(platformId);
            return this;
        }

        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder profileName(@Nullable String profileName) {
            this.profileName = Output.ofNullable(profileName);
            return this;
        }

        public Builder profileVersion(@Nullable Output<String> profileVersion) {
            this.profileVersion = profileVersion;
            return this;
        }

        public Builder profileVersion(@Nullable String profileVersion) {
            this.profileVersion = Output.ofNullable(profileVersion);
            return this;
        }

        public Builder requestedBy(@Nullable Output<String> requestedBy) {
            this.requestedBy = requestedBy;
            return this;
        }

        public Builder requestedBy(@Nullable String requestedBy) {
            this.requestedBy = Output.ofNullable(requestedBy);
            return this;
        }

        public Builder revocationRecords(@Nullable Output<List<SigningJobRevocationRecordGetArgs>> revocationRecords) {
            this.revocationRecords = revocationRecords;
            return this;
        }

        public Builder revocationRecords(@Nullable List<SigningJobRevocationRecordGetArgs> revocationRecords) {
            this.revocationRecords = Output.ofNullable(revocationRecords);
            return this;
        }

        public Builder signatureExpiresAt(@Nullable Output<String> signatureExpiresAt) {
            this.signatureExpiresAt = signatureExpiresAt;
            return this;
        }

        public Builder signatureExpiresAt(@Nullable String signatureExpiresAt) {
            this.signatureExpiresAt = Output.ofNullable(signatureExpiresAt);
            return this;
        }

        public Builder signedObjects(@Nullable Output<List<SigningJobSignedObjectGetArgs>> signedObjects) {
            this.signedObjects = signedObjects;
            return this;
        }

        public Builder signedObjects(@Nullable List<SigningJobSignedObjectGetArgs> signedObjects) {
            this.signedObjects = Output.ofNullable(signedObjects);
            return this;
        }

        public Builder source(@Nullable Output<SigningJobSourceGetArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable SigningJobSourceGetArgs source) {
            this.source = Output.ofNullable(source);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder statusReason(@Nullable Output<String> statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        public Builder statusReason(@Nullable String statusReason) {
            this.statusReason = Output.ofNullable(statusReason);
            return this;
        }
        public SigningJobState build() {
            return new SigningJobState(completedAt, createdAt, destination, ignoreSigningJobFailure, jobId, jobInvoker, jobOwner, platformDisplayName, platformId, profileName, profileVersion, requestedBy, revocationRecords, signatureExpiresAt, signedObjects, source, status, statusReason);
        }
    }
}
