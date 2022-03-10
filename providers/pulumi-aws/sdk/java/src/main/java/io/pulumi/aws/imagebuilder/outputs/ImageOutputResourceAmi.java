// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageOutputResourceAmi {
    /**
     * Account identifier of the AMI.
     * 
     */
    private final @Nullable String accountId;
    /**
     * Description of the AMI.
     * 
     */
    private final @Nullable String description;
    /**
     * Identifier of the AMI.
     * 
     */
    private final @Nullable String image;
    /**
     * Name of the AMI.
     * 
     */
    private final @Nullable String name;
    /**
     * Region of the AMI.
     * 
     */
    private final @Nullable String region;

    @OutputCustomType.Constructor
    private ImageOutputResourceAmi(
        @OutputCustomType.Parameter("accountId") @Nullable String accountId,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("image") @Nullable String image,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("region") @Nullable String region) {
        this.accountId = accountId;
        this.description = description;
        this.image = image;
        this.name = name;
        this.region = region;
    }

    /**
     * Account identifier of the AMI.
     * 
    */
    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * Description of the AMI.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Identifier of the AMI.
     * 
    */
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }
    /**
     * Name of the AMI.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Region of the AMI.
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOutputResourceAmi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String description;
        private @Nullable String image;
        private @Nullable String name;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOutputResourceAmi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }
        public ImageOutputResourceAmi build() {
            return new ImageOutputResourceAmi(accountId, description, image, name, region);
        }
    }
}
