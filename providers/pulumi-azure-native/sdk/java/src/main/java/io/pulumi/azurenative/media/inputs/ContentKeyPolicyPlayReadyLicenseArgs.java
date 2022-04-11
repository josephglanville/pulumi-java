// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ContentKeyPolicyPlayReadyContentType;
import io.pulumi.azurenative.media.enums.ContentKeyPolicyPlayReadyLicenseType;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyPlayRightArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The PlayReady license
 * 
 */
public final class ContentKeyPolicyPlayReadyLicenseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyLicenseArgs Empty = new ContentKeyPolicyPlayReadyLicenseArgs();

    /**
     * A flag indicating whether test devices can use the license.
     * 
     */
    @Import(name="allowTestDevices", required=true)
      private final Output<Boolean> allowTestDevices;

    public Output<Boolean> getAllowTestDevices() {
        return this.allowTestDevices;
    }

    /**
     * The begin date of license
     * 
     */
    @Import(name="beginDate")
      private final @Nullable Output<String> beginDate;

    public Output<String> getBeginDate() {
        return this.beginDate == null ? Codegen.empty() : this.beginDate;
    }

    /**
     * The content key location.
     * 
     */
    @Import(name="contentKeyLocation", required=true)
      private final Output<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation;

    public Output<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> getContentKeyLocation() {
        return this.contentKeyLocation;
    }

    /**
     * The PlayReady content type.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType;

    public Output<Either<String,ContentKeyPolicyPlayReadyContentType>> getContentType() {
        return this.contentType;
    }

    /**
     * The expiration date of license.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Codegen.empty() : this.expirationDate;
    }

    /**
     * The grace period of license.
     * 
     */
    @Import(name="gracePeriod")
      private final @Nullable Output<String> gracePeriod;

    public Output<String> getGracePeriod() {
        return this.gracePeriod == null ? Codegen.empty() : this.gracePeriod;
    }

    /**
     * The license type.
     * 
     */
    @Import(name="licenseType", required=true)
      private final Output<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType;

    public Output<Either<String,ContentKeyPolicyPlayReadyLicenseType>> getLicenseType() {
        return this.licenseType;
    }

    /**
     * The license PlayRight
     * 
     */
    @Import(name="playRight")
      private final @Nullable Output<ContentKeyPolicyPlayReadyPlayRightArgs> playRight;

    public Output<ContentKeyPolicyPlayReadyPlayRightArgs> getPlayRight() {
        return this.playRight == null ? Codegen.empty() : this.playRight;
    }

    /**
     * The relative begin date of license.
     * 
     */
    @Import(name="relativeBeginDate")
      private final @Nullable Output<String> relativeBeginDate;

    public Output<String> getRelativeBeginDate() {
        return this.relativeBeginDate == null ? Codegen.empty() : this.relativeBeginDate;
    }

    /**
     * The relative expiration date of license.
     * 
     */
    @Import(name="relativeExpirationDate")
      private final @Nullable Output<String> relativeExpirationDate;

    public Output<String> getRelativeExpirationDate() {
        return this.relativeExpirationDate == null ? Codegen.empty() : this.relativeExpirationDate;
    }

    public ContentKeyPolicyPlayReadyLicenseArgs(
        Output<Boolean> allowTestDevices,
        @Nullable Output<String> beginDate,
        Output<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation,
        Output<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType,
        @Nullable Output<String> expirationDate,
        @Nullable Output<String> gracePeriod,
        Output<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType,
        @Nullable Output<ContentKeyPolicyPlayReadyPlayRightArgs> playRight,
        @Nullable Output<String> relativeBeginDate,
        @Nullable Output<String> relativeExpirationDate) {
        this.allowTestDevices = Objects.requireNonNull(allowTestDevices, "expected parameter 'allowTestDevices' to be non-null");
        this.beginDate = beginDate;
        this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation, "expected parameter 'contentKeyLocation' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    private ContentKeyPolicyPlayReadyLicenseArgs() {
        this.allowTestDevices = Codegen.empty();
        this.beginDate = Codegen.empty();
        this.contentKeyLocation = Codegen.empty();
        this.contentType = Codegen.empty();
        this.expirationDate = Codegen.empty();
        this.gracePeriod = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.playRight = Codegen.empty();
        this.relativeBeginDate = Codegen.empty();
        this.relativeExpirationDate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> allowTestDevices;
        private @Nullable Output<String> beginDate;
        private Output<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation;
        private Output<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<String> gracePeriod;
        private Output<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType;
        private @Nullable Output<ContentKeyPolicyPlayReadyPlayRightArgs> playRight;
        private @Nullable Output<String> relativeBeginDate;
        private @Nullable Output<String> relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocation = defaults.contentKeyLocation;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder allowTestDevices(Output<Boolean> allowTestDevices) {
            this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
            return this;
        }
        public Builder allowTestDevices(Boolean allowTestDevices) {
            this.allowTestDevices = Output.of(Objects.requireNonNull(allowTestDevices));
            return this;
        }
        public Builder beginDate(@Nullable Output<String> beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public Builder beginDate(@Nullable String beginDate) {
            this.beginDate = Codegen.ofNullable(beginDate);
            return this;
        }
        public Builder contentKeyLocation(Output<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation) {
            this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
            return this;
        }
        public Builder contentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs> contentKeyLocation) {
            this.contentKeyLocation = Output.of(Objects.requireNonNull(contentKeyLocation));
            return this;
        }
        public Builder contentType(Output<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(Either<String,ContentKeyPolicyPlayReadyContentType> contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Codegen.ofNullable(expirationDate);
            return this;
        }
        public Builder gracePeriod(@Nullable Output<String> gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }
        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = Codegen.ofNullable(gracePeriod);
            return this;
        }
        public Builder licenseType(Output<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }
        public Builder licenseType(Either<String,ContentKeyPolicyPlayReadyLicenseType> licenseType) {
            this.licenseType = Output.of(Objects.requireNonNull(licenseType));
            return this;
        }
        public Builder playRight(@Nullable Output<ContentKeyPolicyPlayReadyPlayRightArgs> playRight) {
            this.playRight = playRight;
            return this;
        }
        public Builder playRight(@Nullable ContentKeyPolicyPlayReadyPlayRightArgs playRight) {
            this.playRight = Codegen.ofNullable(playRight);
            return this;
        }
        public Builder relativeBeginDate(@Nullable Output<String> relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }
        public Builder relativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = Codegen.ofNullable(relativeBeginDate);
            return this;
        }
        public Builder relativeExpirationDate(@Nullable Output<String> relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }
        public Builder relativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = Codegen.ofNullable(relativeExpirationDate);
            return this;
        }        public ContentKeyPolicyPlayReadyLicenseArgs build() {
            return new ContentKeyPolicyPlayReadyLicenseArgs(allowTestDevices, beginDate, contentKeyLocation, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}
