// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImagePipelineImageTestsConfiguration;
import io.pulumi.aws.imagebuilder.outputs.GetImagePipelineSchedule;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetImagePipelineResult {
    private final String arn;
    /**
     * Date the image pipeline was created.
     * 
     */
    private final String dateCreated;
    /**
     * Date the image pipeline was last run.
     * 
     */
    private final String dateLastRun;
    /**
     * Date the image pipeline will run next.
     * 
     */
    private final String dateNextRun;
    /**
     * Date the image pipeline was updated.
     * 
     */
    private final String dateUpdated;
    /**
     * Description of the image pipeline.
     * 
     */
    private final String description;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    private final String distributionConfigurationArn;
    /**
     * Whether additional information about the image being created is collected.
     * 
     */
    private final Boolean enhancedImageMetadataEnabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    private final String imageRecipeArn;
    /**
     * List of an object with image tests configuration.
     * 
     */
    private final List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations;
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    private final String infrastructureConfigurationArn;
    /**
     * Name of the image pipeline.
     * 
     */
    private final String name;
    /**
     * Platform of the image pipeline.
     * 
     */
    private final String platform;
    /**
     * List of an object with schedule settings.
     * 
     */
    private final List<GetImagePipelineSchedule> schedules;
    /**
     * Status of the image pipeline.
     * 
     */
    private final String status;
    /**
     * Key-value map of resource tags for the image pipeline.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetImagePipelineResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("dateCreated") String dateCreated,
        @CustomType.Parameter("dateLastRun") String dateLastRun,
        @CustomType.Parameter("dateNextRun") String dateNextRun,
        @CustomType.Parameter("dateUpdated") String dateUpdated,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("distributionConfigurationArn") String distributionConfigurationArn,
        @CustomType.Parameter("enhancedImageMetadataEnabled") Boolean enhancedImageMetadataEnabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageRecipeArn") String imageRecipeArn,
        @CustomType.Parameter("imageTestsConfigurations") List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations,
        @CustomType.Parameter("infrastructureConfigurationArn") String infrastructureConfigurationArn,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("schedules") List<GetImagePipelineSchedule> schedules,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.dateCreated = dateCreated;
        this.dateLastRun = dateLastRun;
        this.dateNextRun = dateNextRun;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.id = id;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfigurations = imageTestsConfigurations;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.name = name;
        this.platform = platform;
        this.schedules = schedules;
        this.status = status;
        this.tags = tags;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Date the image pipeline was created.
     * 
    */
    public String getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Date the image pipeline was last run.
     * 
    */
    public String getDateLastRun() {
        return this.dateLastRun;
    }
    /**
     * Date the image pipeline will run next.
     * 
    */
    public String getDateNextRun() {
        return this.dateNextRun;
    }
    /**
     * Date the image pipeline was updated.
     * 
    */
    public String getDateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description of the image pipeline.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
    */
    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * Whether additional information about the image being created is collected.
     * 
    */
    public Boolean getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
    */
    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * List of an object with image tests configuration.
     * 
    */
    public List<GetImagePipelineImageTestsConfiguration> getImageTestsConfigurations() {
        return this.imageTestsConfigurations;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
    */
    public String getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the image pipeline.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Platform of the image pipeline.
     * 
    */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * List of an object with schedule settings.
     * 
    */
    public List<GetImagePipelineSchedule> getSchedules() {
        return this.schedules;
    }
    /**
     * Status of the image pipeline.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags for the image pipeline.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String dateCreated;
        private String dateLastRun;
        private String dateNextRun;
        private String dateUpdated;
        private String description;
        private String distributionConfigurationArn;
        private Boolean enhancedImageMetadataEnabled;
        private String id;
        private String imageRecipeArn;
        private List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations;
        private String infrastructureConfigurationArn;
        private String name;
        private String platform;
        private List<GetImagePipelineSchedule> schedules;
        private String status;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.dateLastRun = defaults.dateLastRun;
    	      this.dateNextRun = defaults.dateNextRun;
    	      this.dateUpdated = defaults.dateUpdated;
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.id = defaults.id;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfigurations = defaults.imageTestsConfigurations;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.schedules = defaults.schedules;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }
        public Builder dateLastRun(String dateLastRun) {
            this.dateLastRun = Objects.requireNonNull(dateLastRun);
            return this;
        }
        public Builder dateNextRun(String dateNextRun) {
            this.dateNextRun = Objects.requireNonNull(dateNextRun);
            return this;
        }
        public Builder dateUpdated(String dateUpdated) {
            this.dateUpdated = Objects.requireNonNull(dateUpdated);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder distributionConfigurationArn(String distributionConfigurationArn) {
            this.distributionConfigurationArn = Objects.requireNonNull(distributionConfigurationArn);
            return this;
        }
        public Builder enhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Objects.requireNonNull(enhancedImageMetadataEnabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }
        public Builder imageTestsConfigurations(List<GetImagePipelineImageTestsConfiguration> imageTestsConfigurations) {
            this.imageTestsConfigurations = Objects.requireNonNull(imageTestsConfigurations);
            return this;
        }
        public Builder imageTestsConfigurations(GetImagePipelineImageTestsConfiguration... imageTestsConfigurations) {
            return imageTestsConfigurations(List.of(imageTestsConfigurations));
        }
        public Builder infrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder schedules(List<GetImagePipelineSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetImagePipelineSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetImagePipelineResult build() {
            return new GetImagePipelineResult(arn, dateCreated, dateLastRun, dateNextRun, dateUpdated, description, distributionConfigurationArn, enhancedImageMetadataEnabled, id, imageRecipeArn, imageTestsConfigurations, infrastructureConfigurationArn, name, platform, schedules, status, tags);
        }
    }
}