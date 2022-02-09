// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppHybridConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppHybridConnectionSlotArgs Empty = new WebAppHybridConnectionSlotArgs();

    @InputImport(name="hostname")
    private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="relayArmUri")
    private final @Nullable Input<String> relayArmUri;

    public Input<String> getRelayArmUri() {
        return this.relayArmUri == null ? Input.empty() : this.relayArmUri;
    }

    @InputImport(name="relayName")
    private final @Nullable Input<String> relayName;

    public Input<String> getRelayName() {
        return this.relayName == null ? Input.empty() : this.relayName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sendKeyName")
    private final @Nullable Input<String> sendKeyName;

    public Input<String> getSendKeyName() {
        return this.sendKeyName == null ? Input.empty() : this.sendKeyName;
    }

    @InputImport(name="sendKeyValue")
    private final @Nullable Input<String> sendKeyValue;

    public Input<String> getSendKeyValue() {
        return this.sendKeyValue == null ? Input.empty() : this.sendKeyValue;
    }

    @InputImport(name="serviceBusNamespace")
    private final @Nullable Input<String> serviceBusNamespace;

    public Input<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Input.empty() : this.serviceBusNamespace;
    }

    @InputImport(name="serviceBusSuffix")
    private final @Nullable Input<String> serviceBusSuffix;

    public Input<String> getServiceBusSuffix() {
        return this.serviceBusSuffix == null ? Input.empty() : this.serviceBusSuffix;
    }

    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    public WebAppHybridConnectionSlotArgs(
        @Nullable Input<String> hostname,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> namespaceName,
        @Nullable Input<Integer> port,
        @Nullable Input<String> relayArmUri,
        @Nullable Input<String> relayName,
        Input<String> resourceGroupName,
        @Nullable Input<String> sendKeyName,
        @Nullable Input<String> sendKeyValue,
        @Nullable Input<String> serviceBusNamespace,
        @Nullable Input<String> serviceBusSuffix,
        Input<String> slot) {
        this.hostname = hostname;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.port = port;
        this.relayArmUri = relayArmUri;
        this.relayName = relayName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sendKeyName = sendKeyName;
        this.sendKeyValue = sendKeyValue;
        this.serviceBusNamespace = serviceBusNamespace;
        this.serviceBusSuffix = serviceBusSuffix;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppHybridConnectionSlotArgs() {
        this.hostname = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.namespaceName = Input.empty();
        this.port = Input.empty();
        this.relayArmUri = Input.empty();
        this.relayName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sendKeyName = Input.empty();
        this.sendKeyValue = Input.empty();
        this.serviceBusNamespace = Input.empty();
        this.serviceBusSuffix = Input.empty();
        this.slot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppHybridConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostname;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> namespaceName;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> relayArmUri;
        private @Nullable Input<String> relayName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sendKeyName;
        private @Nullable Input<String> sendKeyValue;
        private @Nullable Input<String> serviceBusNamespace;
        private @Nullable Input<String> serviceBusSuffix;
        private Input<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppHybridConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.port = defaults.port;
    	      this.relayArmUri = defaults.relayArmUri;
    	      this.relayName = defaults.relayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sendKeyName = defaults.sendKeyName;
    	      this.sendKeyValue = defaults.sendKeyValue;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.serviceBusSuffix = defaults.serviceBusSuffix;
    	      this.slot = defaults.slot;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRelayArmUri(@Nullable Input<String> relayArmUri) {
            this.relayArmUri = relayArmUri;
            return this;
        }

        public Builder setRelayArmUri(@Nullable String relayArmUri) {
            this.relayArmUri = Input.ofNullable(relayArmUri);
            return this;
        }

        public Builder setRelayName(@Nullable Input<String> relayName) {
            this.relayName = relayName;
            return this;
        }

        public Builder setRelayName(@Nullable String relayName) {
            this.relayName = Input.ofNullable(relayName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSendKeyName(@Nullable Input<String> sendKeyName) {
            this.sendKeyName = sendKeyName;
            return this;
        }

        public Builder setSendKeyName(@Nullable String sendKeyName) {
            this.sendKeyName = Input.ofNullable(sendKeyName);
            return this;
        }

        public Builder setSendKeyValue(@Nullable Input<String> sendKeyValue) {
            this.sendKeyValue = sendKeyValue;
            return this;
        }

        public Builder setSendKeyValue(@Nullable String sendKeyValue) {
            this.sendKeyValue = Input.ofNullable(sendKeyValue);
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable Input<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Input.ofNullable(serviceBusNamespace);
            return this;
        }

        public Builder setServiceBusSuffix(@Nullable Input<String> serviceBusSuffix) {
            this.serviceBusSuffix = serviceBusSuffix;
            return this;
        }

        public Builder setServiceBusSuffix(@Nullable String serviceBusSuffix) {
            this.serviceBusSuffix = Input.ofNullable(serviceBusSuffix);
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public WebAppHybridConnectionSlotArgs build() {
            return new WebAppHybridConnectionSlotArgs(hostname, kind, name, namespaceName, port, relayArmUri, relayName, resourceGroupName, sendKeyName, sendKeyValue, serviceBusNamespace, serviceBusSuffix, slot);
        }
    }
}
