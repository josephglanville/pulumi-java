// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalAddressState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalAddressState Empty = new GlobalAddressState();

    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    @InputImport(name="addressType")
    private final @Nullable Input<String> addressType;

    public Input<String> getAddressType() {
        return this.addressType == null ? Input.empty() : this.addressType;
    }

    @InputImport(name="creationTimestamp")
    private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="ipVersion")
    private final @Nullable Input<String> ipVersion;

    public Input<String> getIpVersion() {
        return this.ipVersion == null ? Input.empty() : this.ipVersion;
    }

    @InputImport(name="labelFingerprint")
    private final @Nullable Input<String> labelFingerprint;

    public Input<String> getLabelFingerprint() {
        return this.labelFingerprint == null ? Input.empty() : this.labelFingerprint;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="prefixLength")
    private final @Nullable Input<Integer> prefixLength;

    public Input<Integer> getPrefixLength() {
        return this.prefixLength == null ? Input.empty() : this.prefixLength;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="purpose")
    private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public GlobalAddressState(
        @Nullable Input<String> address,
        @Nullable Input<String> addressType,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> ipVersion,
        @Nullable Input<String> labelFingerprint,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Integer> prefixLength,
        @Nullable Input<String> project,
        @Nullable Input<String> purpose,
        @Nullable Input<String> selfLink) {
        this.address = address;
        this.addressType = addressType;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.ipVersion = ipVersion;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.prefixLength = prefixLength;
        this.project = project;
        this.purpose = purpose;
        this.selfLink = selfLink;
    }

    private GlobalAddressState() {
        this.address = Input.empty();
        this.addressType = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.ipVersion = Input.empty();
        this.labelFingerprint = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.prefixLength = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalAddressState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> addressType;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> ipVersion;
        private @Nullable Input<String> labelFingerprint;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Integer> prefixLength;
        private @Nullable Input<String> project;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalAddressState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.ipVersion = defaults.ipVersion;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.prefixLength = defaults.prefixLength;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setAddressType(@Nullable Input<String> addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder setAddressType(@Nullable String addressType) {
            this.addressType = Input.ofNullable(addressType);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIpVersion(@Nullable Input<String> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        public Builder setIpVersion(@Nullable String ipVersion) {
            this.ipVersion = Input.ofNullable(ipVersion);
            return this;
        }

        public Builder setLabelFingerprint(@Nullable Input<String> labelFingerprint) {
            this.labelFingerprint = labelFingerprint;
            return this;
        }

        public Builder setLabelFingerprint(@Nullable String labelFingerprint) {
            this.labelFingerprint = Input.ofNullable(labelFingerprint);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPrefixLength(@Nullable Input<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder setPrefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Input.ofNullable(prefixLength);
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

        public Builder setPurpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setPurpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public GlobalAddressState build() {
            return new GlobalAddressState(address, addressType, creationTimestamp, description, ipVersion, labelFingerprint, labels, name, network, prefixLength, project, purpose, selfLink);
        }
    }
}