// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.azurenative.azurestack.inputs.CompatibilityResponse;
import io.pulumi.azurenative.azurestack.inputs.IconUrisResponse;
import io.pulumi.azurenative.azurestack.inputs.ProductLinkResponse;
import io.pulumi.azurenative.azurestack.inputs.ProductPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Product information.
 * 
 */
public final class ProductResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProductResponse Empty = new ProductResponse();

    /**
     * The part number used for billing purposes.
     * 
     */
    @Import(name="billingPartNumber")
      private final @Nullable String billingPartNumber;

    public Optional<String> getBillingPartNumber() {
        return this.billingPartNumber == null ? Optional.empty() : Optional.ofNullable(this.billingPartNumber);
    }

    /**
     * Product compatibility with current device.
     * 
     */
    @Import(name="compatibility")
      private final @Nullable CompatibilityResponse compatibility;

    public Optional<CompatibilityResponse> getCompatibility() {
        return this.compatibility == null ? Optional.empty() : Optional.ofNullable(this.compatibility);
    }

    /**
     * The description of the product.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The display name of the product.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    @Import(name="etag")
      private final @Nullable String etag;

    public Optional<String> getEtag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * The identifier of the gallery item corresponding to the product.
     * 
     */
    @Import(name="galleryItemIdentity")
      private final @Nullable String galleryItemIdentity;

    public Optional<String> getGalleryItemIdentity() {
        return this.galleryItemIdentity == null ? Optional.empty() : Optional.ofNullable(this.galleryItemIdentity);
    }

    /**
     * Additional links available for this product.
     * 
     */
    @Import(name="iconUris")
      private final @Nullable IconUrisResponse iconUris;

    public Optional<IconUrisResponse> getIconUris() {
        return this.iconUris == null ? Optional.empty() : Optional.ofNullable(this.iconUris);
    }

    /**
     * ID of the resource.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The legal terms.
     * 
     */
    @Import(name="legalTerms")
      private final @Nullable String legalTerms;

    public Optional<String> getLegalTerms() {
        return this.legalTerms == null ? Optional.empty() : Optional.ofNullable(this.legalTerms);
    }

    /**
     * Additional links available for this product.
     * 
     */
    @Import(name="links")
      private final @Nullable List<ProductLinkResponse> links;

    public List<ProductLinkResponse> getLinks() {
        return this.links == null ? List.of() : this.links;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The offer representing the product.
     * 
     */
    @Import(name="offer")
      private final @Nullable String offer;

    public Optional<String> getOffer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    /**
     * The version of the product offer.
     * 
     */
    @Import(name="offerVersion")
      private final @Nullable String offerVersion;

    public Optional<String> getOfferVersion() {
        return this.offerVersion == null ? Optional.empty() : Optional.ofNullable(this.offerVersion);
    }

    /**
     * The length of product content.
     * 
     */
    @Import(name="payloadLength")
      private final @Nullable Double payloadLength;

    public Optional<Double> getPayloadLength() {
        return this.payloadLength == null ? Optional.empty() : Optional.ofNullable(this.payloadLength);
    }

    /**
     * The privacy policy.
     * 
     */
    @Import(name="privacyPolicy")
      private final @Nullable String privacyPolicy;

    public Optional<String> getPrivacyPolicy() {
        return this.privacyPolicy == null ? Optional.empty() : Optional.ofNullable(this.privacyPolicy);
    }

    /**
     * The kind of the product (virtualMachine or virtualMachineExtension)
     * 
     */
    @Import(name="productKind")
      private final @Nullable String productKind;

    public Optional<String> getProductKind() {
        return this.productKind == null ? Optional.empty() : Optional.ofNullable(this.productKind);
    }

    /**
     * Additional properties for the product.
     * 
     */
    @Import(name="productProperties")
      private final @Nullable ProductPropertiesResponse productProperties;

    public Optional<ProductPropertiesResponse> getProductProperties() {
        return this.productProperties == null ? Optional.empty() : Optional.ofNullable(this.productProperties);
    }

    /**
     * The user-friendly name of the product publisher.
     * 
     */
    @Import(name="publisherDisplayName")
      private final @Nullable String publisherDisplayName;

    public Optional<String> getPublisherDisplayName() {
        return this.publisherDisplayName == null ? Optional.empty() : Optional.ofNullable(this.publisherDisplayName);
    }

    /**
     * Publisher identifier.
     * 
     */
    @Import(name="publisherIdentifier")
      private final @Nullable String publisherIdentifier;

    public Optional<String> getPublisherIdentifier() {
        return this.publisherIdentifier == null ? Optional.empty() : Optional.ofNullable(this.publisherIdentifier);
    }

    /**
     * The product SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable String sku;

    public Optional<String> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Type of Resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The type of the Virtual Machine Extension.
     * 
     */
    @Import(name="vmExtensionType")
      private final @Nullable String vmExtensionType;

    public Optional<String> getVmExtensionType() {
        return this.vmExtensionType == null ? Optional.empty() : Optional.ofNullable(this.vmExtensionType);
    }

    public ProductResponse(
        @Nullable String billingPartNumber,
        @Nullable CompatibilityResponse compatibility,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String etag,
        @Nullable String galleryItemIdentity,
        @Nullable IconUrisResponse iconUris,
        String id,
        @Nullable String legalTerms,
        @Nullable List<ProductLinkResponse> links,
        String name,
        @Nullable String offer,
        @Nullable String offerVersion,
        @Nullable Double payloadLength,
        @Nullable String privacyPolicy,
        @Nullable String productKind,
        @Nullable ProductPropertiesResponse productProperties,
        @Nullable String publisherDisplayName,
        @Nullable String publisherIdentifier,
        @Nullable String sku,
        String type,
        @Nullable String vmExtensionType) {
        this.billingPartNumber = billingPartNumber;
        this.compatibility = compatibility;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.galleryItemIdentity = galleryItemIdentity;
        this.iconUris = iconUris;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.legalTerms = legalTerms;
        this.links = links;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.offer = offer;
        this.offerVersion = offerVersion;
        this.payloadLength = payloadLength;
        this.privacyPolicy = privacyPolicy;
        this.productKind = productKind;
        this.productProperties = productProperties;
        this.publisherDisplayName = publisherDisplayName;
        this.publisherIdentifier = publisherIdentifier;
        this.sku = sku;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vmExtensionType = vmExtensionType;
    }

    private ProductResponse() {
        this.billingPartNumber = null;
        this.compatibility = null;
        this.description = null;
        this.displayName = null;
        this.etag = null;
        this.galleryItemIdentity = null;
        this.iconUris = null;
        this.id = null;
        this.legalTerms = null;
        this.links = List.of();
        this.name = null;
        this.offer = null;
        this.offerVersion = null;
        this.payloadLength = null;
        this.privacyPolicy = null;
        this.productKind = null;
        this.productProperties = null;
        this.publisherDisplayName = null;
        this.publisherIdentifier = null;
        this.sku = null;
        this.type = null;
        this.vmExtensionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingPartNumber;
        private @Nullable CompatibilityResponse compatibility;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String etag;
        private @Nullable String galleryItemIdentity;
        private @Nullable IconUrisResponse iconUris;
        private String id;
        private @Nullable String legalTerms;
        private @Nullable List<ProductLinkResponse> links;
        private String name;
        private @Nullable String offer;
        private @Nullable String offerVersion;
        private @Nullable Double payloadLength;
        private @Nullable String privacyPolicy;
        private @Nullable String productKind;
        private @Nullable ProductPropertiesResponse productProperties;
        private @Nullable String publisherDisplayName;
        private @Nullable String publisherIdentifier;
        private @Nullable String sku;
        private String type;
        private @Nullable String vmExtensionType;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingPartNumber = defaults.billingPartNumber;
    	      this.compatibility = defaults.compatibility;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.galleryItemIdentity = defaults.galleryItemIdentity;
    	      this.iconUris = defaults.iconUris;
    	      this.id = defaults.id;
    	      this.legalTerms = defaults.legalTerms;
    	      this.links = defaults.links;
    	      this.name = defaults.name;
    	      this.offer = defaults.offer;
    	      this.offerVersion = defaults.offerVersion;
    	      this.payloadLength = defaults.payloadLength;
    	      this.privacyPolicy = defaults.privacyPolicy;
    	      this.productKind = defaults.productKind;
    	      this.productProperties = defaults.productProperties;
    	      this.publisherDisplayName = defaults.publisherDisplayName;
    	      this.publisherIdentifier = defaults.publisherIdentifier;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.vmExtensionType = defaults.vmExtensionType;
        }

        public Builder billingPartNumber(@Nullable String billingPartNumber) {
            this.billingPartNumber = billingPartNumber;
            return this;
        }
        public Builder compatibility(@Nullable CompatibilityResponse compatibility) {
            this.compatibility = compatibility;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder galleryItemIdentity(@Nullable String galleryItemIdentity) {
            this.galleryItemIdentity = galleryItemIdentity;
            return this;
        }
        public Builder iconUris(@Nullable IconUrisResponse iconUris) {
            this.iconUris = iconUris;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder legalTerms(@Nullable String legalTerms) {
            this.legalTerms = legalTerms;
            return this;
        }
        public Builder links(@Nullable List<ProductLinkResponse> links) {
            this.links = links;
            return this;
        }
        public Builder links(ProductLinkResponse... links) {
            return links(List.of(links));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder offerVersion(@Nullable String offerVersion) {
            this.offerVersion = offerVersion;
            return this;
        }
        public Builder payloadLength(@Nullable Double payloadLength) {
            this.payloadLength = payloadLength;
            return this;
        }
        public Builder privacyPolicy(@Nullable String privacyPolicy) {
            this.privacyPolicy = privacyPolicy;
            return this;
        }
        public Builder productKind(@Nullable String productKind) {
            this.productKind = productKind;
            return this;
        }
        public Builder productProperties(@Nullable ProductPropertiesResponse productProperties) {
            this.productProperties = productProperties;
            return this;
        }
        public Builder publisherDisplayName(@Nullable String publisherDisplayName) {
            this.publisherDisplayName = publisherDisplayName;
            return this;
        }
        public Builder publisherIdentifier(@Nullable String publisherIdentifier) {
            this.publisherIdentifier = publisherIdentifier;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vmExtensionType(@Nullable String vmExtensionType) {
            this.vmExtensionType = vmExtensionType;
            return this;
        }        public ProductResponse build() {
            return new ProductResponse(billingPartNumber, compatibility, description, displayName, etag, galleryItemIdentity, iconUris, id, legalTerms, links, name, offer, offerVersion, payloadLength, privacyPolicy, productKind, productProperties, publisherDisplayName, publisherIdentifier, sku, type, vmExtensionType);
        }
    }
}
