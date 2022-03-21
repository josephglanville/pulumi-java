// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretVersionResult {
    /**
     * The ARN of the secret.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
     * 
     */
    private final String secretBinary;
    private final String secretId;
    /**
     * The decrypted part of the protected secret information that was originally provided as a string.
     * 
     */
    private final String secretString;
    /**
     * The unique identifier of this version of the secret.
     * 
     */
    private final String versionId;
    private final @Nullable String versionStage;
    private final List<String> versionStages;

    @CustomType.Constructor
    private GetSecretVersionResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("secretBinary") String secretBinary,
        @CustomType.Parameter("secretId") String secretId,
        @CustomType.Parameter("secretString") String secretString,
        @CustomType.Parameter("versionId") String versionId,
        @CustomType.Parameter("versionStage") @Nullable String versionStage,
        @CustomType.Parameter("versionStages") List<String> versionStages) {
        this.arn = arn;
        this.id = id;
        this.secretBinary = secretBinary;
        this.secretId = secretId;
        this.secretString = secretString;
        this.versionId = versionId;
        this.versionStage = versionStage;
        this.versionStages = versionStages;
    }

    /**
     * The ARN of the secret.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
     * 
    */
    public String getSecretBinary() {
        return this.secretBinary;
    }
    public String getSecretId() {
        return this.secretId;
    }
    /**
     * The decrypted part of the protected secret information that was originally provided as a string.
     * 
    */
    public String getSecretString() {
        return this.secretString;
    }
    /**
     * The unique identifier of this version of the secret.
     * 
    */
    public String getVersionId() {
        return this.versionId;
    }
    public Optional<String> getVersionStage() {
        return Optional.ofNullable(this.versionStage);
    }
    public List<String> getVersionStages() {
        return this.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String secretBinary;
        private String secretId;
        private String secretString;
        private String versionId;
        private @Nullable String versionStage;
        private List<String> versionStages;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.secretBinary = defaults.secretBinary;
    	      this.secretId = defaults.secretId;
    	      this.secretString = defaults.secretString;
    	      this.versionId = defaults.versionId;
    	      this.versionStage = defaults.versionStage;
    	      this.versionStages = defaults.versionStages;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder secretBinary(String secretBinary) {
            this.secretBinary = Objects.requireNonNull(secretBinary);
            return this;
        }
        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public Builder secretString(String secretString) {
            this.secretString = Objects.requireNonNull(secretString);
            return this;
        }
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public Builder versionStage(@Nullable String versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public Builder versionStages(List<String> versionStages) {
            this.versionStages = Objects.requireNonNull(versionStages);
            return this;
        }
        public Builder versionStages(String... versionStages) {
            return versionStages(List.of(versionStages));
        }        public GetSecretVersionResult build() {
            return new GetSecretVersionResult(arn, id, secretBinary, secretId, secretString, versionId, versionStage, versionStages);
        }
    }
}
