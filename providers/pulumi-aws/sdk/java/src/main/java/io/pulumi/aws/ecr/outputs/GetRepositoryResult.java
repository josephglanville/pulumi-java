// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.aws.ecr.outputs.GetRepositoryEncryptionConfiguration;
import io.pulumi.aws.ecr.outputs.GetRepositoryImageScanningConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryResult {
    /**
     * Full ARN of the repository.
     * 
     */
    private final String arn;
    /**
     * Encryption configuration for the repository. See Encryption Configuration below.
     * 
     */
    private final List<GetRepositoryEncryptionConfiguration> encryptionConfigurations;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
     * 
     */
    private final List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations;
    /**
     * The tag mutability setting for the repository.
     * 
     */
    private final String imageTagMutability;
    private final String name;
    private final String registryId;
    /**
     * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
     * 
     */
    private final String repositoryUrl;
    /**
     * A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetRepositoryResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("encryptionConfigurations") List<GetRepositoryEncryptionConfiguration> encryptionConfigurations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageScanningConfigurations") List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations,
        @CustomType.Parameter("imageTagMutability") String imageTagMutability,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("registryId") String registryId,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.encryptionConfigurations = encryptionConfigurations;
        this.id = id;
        this.imageScanningConfigurations = imageScanningConfigurations;
        this.imageTagMutability = imageTagMutability;
        this.name = name;
        this.registryId = registryId;
        this.repositoryUrl = repositoryUrl;
        this.tags = tags;
    }

    /**
     * Full ARN of the repository.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Encryption configuration for the repository. See Encryption Configuration below.
     * 
    */
    public List<GetRepositoryEncryptionConfiguration> getEncryptionConfigurations() {
        return this.encryptionConfigurations;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
     * 
    */
    public List<GetRepositoryImageScanningConfiguration> getImageScanningConfigurations() {
        return this.imageScanningConfigurations;
    }
    /**
     * The tag mutability setting for the repository.
     * 
    */
    public String getImageTagMutability() {
        return this.imageTagMutability;
    }
    public String getName() {
        return this.name;
    }
    public String getRegistryId() {
        return this.registryId;
    }
    /**
     * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
     * 
    */
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * A map of tags assigned to the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetRepositoryEncryptionConfiguration> encryptionConfigurations;
        private String id;
        private List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations;
        private String imageTagMutability;
        private String name;
        private String registryId;
        private String repositoryUrl;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encryptionConfigurations = defaults.encryptionConfigurations;
    	      this.id = defaults.id;
    	      this.imageScanningConfigurations = defaults.imageScanningConfigurations;
    	      this.imageTagMutability = defaults.imageTagMutability;
    	      this.name = defaults.name;
    	      this.registryId = defaults.registryId;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder encryptionConfigurations(List<GetRepositoryEncryptionConfiguration> encryptionConfigurations) {
            this.encryptionConfigurations = Objects.requireNonNull(encryptionConfigurations);
            return this;
        }
        public Builder encryptionConfigurations(GetRepositoryEncryptionConfiguration... encryptionConfigurations) {
            return encryptionConfigurations(List.of(encryptionConfigurations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageScanningConfigurations(List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations) {
            this.imageScanningConfigurations = Objects.requireNonNull(imageScanningConfigurations);
            return this;
        }
        public Builder imageScanningConfigurations(GetRepositoryImageScanningConfiguration... imageScanningConfigurations) {
            return imageScanningConfigurations(List.of(imageScanningConfigurations));
        }
        public Builder imageTagMutability(String imageTagMutability) {
            this.imageTagMutability = Objects.requireNonNull(imageTagMutability);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetRepositoryResult build() {
            return new GetRepositoryResult(arn, encryptionConfigurations, id, imageScanningConfigurations, imageTagMutability, name, registryId, repositoryUrl, tags);
        }
    }
}
