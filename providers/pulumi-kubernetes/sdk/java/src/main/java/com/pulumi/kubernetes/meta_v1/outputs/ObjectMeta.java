// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta_v1.outputs.ManagedFieldsEntry;
import com.pulumi.kubernetes.meta_v1.outputs.OwnerReference;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectMeta {
    /**
     * @return Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    private final @Nullable Map<String,String> annotations;
    /**
     * @return Deprecated: ClusterName is a legacy field that was always cleared by the system and never used; it will be removed completely in 1.25.
     * 
     * The name in the go struct is changed to help clients detect accidental use.
     * 
     */
    private final @Nullable String clusterName;
    /**
     * @return CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
     * 
     * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable String creationTimestamp;
    /**
     * @return Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     * 
     */
    private final @Nullable Integer deletionGracePeriodSeconds;
    /**
     * @return DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
     * 
     * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable String deletionTimestamp;
    /**
     * @return Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
     * 
     */
    private final @Nullable List<String> finalizers;
    /**
     * @return GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
     * 
     * If this field is specified and the generated name exists, the server will return a 409.
     * 
     * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
     * 
     */
    private final @Nullable String generateName;
    /**
     * @return A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * @return Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * @return ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn&#39;t need to set or understand this field. A workflow can be the user&#39;s name, a controller&#39;s name, or the name of a specific apply path like &#34;ci-cd&#34;. The set of fields is always in the version that the workflow used when modifying the object.
     * 
     */
    private final @Nullable List<ManagedFieldsEntry> managedFields;
    /**
     * @return Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    private final @Nullable String name;
    /**
     * @return Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the &#34;default&#34; namespace, but &#34;default&#34; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
     * 
     * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    private final @Nullable List<OwnerReference> ownerReferences;
    /**
     * @return An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
     * 
     * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private final @Nullable String resourceVersion;
    /**
     * @return Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    private final @Nullable String selfLink;
    /**
     * @return UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private final @Nullable String uid;

    @CustomType.Constructor
    private ObjectMeta(
        @CustomType.Parameter("annotations") @Nullable Map<String,String> annotations,
        @CustomType.Parameter("clusterName") @Nullable String clusterName,
        @CustomType.Parameter("creationTimestamp") @Nullable String creationTimestamp,
        @CustomType.Parameter("deletionGracePeriodSeconds") @Nullable Integer deletionGracePeriodSeconds,
        @CustomType.Parameter("deletionTimestamp") @Nullable String deletionTimestamp,
        @CustomType.Parameter("finalizers") @Nullable List<String> finalizers,
        @CustomType.Parameter("generateName") @Nullable String generateName,
        @CustomType.Parameter("generation") @Nullable Integer generation,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("managedFields") @Nullable List<ManagedFieldsEntry> managedFields,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("ownerReferences") @Nullable List<OwnerReference> ownerReferences,
        @CustomType.Parameter("resourceVersion") @Nullable String resourceVersion,
        @CustomType.Parameter("selfLink") @Nullable String selfLink,
        @CustomType.Parameter("uid") @Nullable String uid) {
        this.annotations = annotations;
        this.clusterName = clusterName;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.labels = labels;
        this.managedFields = managedFields;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    /**
     * @return Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return Deprecated: ClusterName is a legacy field that was always cleared by the system and never used; it will be removed completely in 1.25.
     * 
     * The name in the go struct is changed to help clients detect accidental use.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    /**
     * @return CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
     * 
     * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<String> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }
    /**
     * @return Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     * 
     */
    public Optional<Integer> deletionGracePeriodSeconds() {
        return Optional.ofNullable(this.deletionGracePeriodSeconds);
    }
    /**
     * @return DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
     * 
     * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<String> deletionTimestamp() {
        return Optional.ofNullable(this.deletionTimestamp);
    }
    /**
     * @return Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
     * 
     */
    public List<String> finalizers() {
        return this.finalizers == null ? List.of() : this.finalizers;
    }
    /**
     * @return GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
     * 
     * If this field is specified and the generated name exists, the server will return a 409.
     * 
     * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
     * 
     */
    public Optional<String> generateName() {
        return Optional.ofNullable(this.generateName);
    }
    /**
     * @return A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
     * 
     */
    public Optional<Integer> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * @return Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn&#39;t need to set or understand this field. A workflow can be the user&#39;s name, a controller&#39;s name, or the name of a specific apply path like &#34;ci-cd&#34;. The set of fields is always in the version that the workflow used when modifying the object.
     * 
     */
    public List<ManagedFieldsEntry> managedFields() {
        return this.managedFields == null ? List.of() : this.managedFields;
    }
    /**
     * @return Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the &#34;default&#34; namespace, but &#34;default&#34; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
     * 
     * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     * 
     */
    public List<OwnerReference> ownerReferences() {
        return this.ownerReferences == null ? List.of() : this.ownerReferences;
    }
    /**
     * @return An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
     * 
     * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * @return Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     * 
     */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }
    /**
     * @return UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * 
     * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMeta defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable String clusterName;
        private @Nullable String creationTimestamp;
        private @Nullable Integer deletionGracePeriodSeconds;
        private @Nullable String deletionTimestamp;
        private @Nullable List<String> finalizers;
        private @Nullable String generateName;
        private @Nullable Integer generation;
        private @Nullable Map<String,String> labels;
        private @Nullable List<ManagedFieldsEntry> managedFields;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable List<OwnerReference> ownerReferences;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;
        private @Nullable String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMeta defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterName = defaults.clusterName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deletionGracePeriodSeconds = defaults.deletionGracePeriodSeconds;
    	      this.deletionTimestamp = defaults.deletionTimestamp;
    	      this.finalizers = defaults.finalizers;
    	      this.generateName = defaults.generateName;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.managedFields = defaults.managedFields;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.ownerReferences = defaults.ownerReferences;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder deletionGracePeriodSeconds(@Nullable Integer deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
            return this;
        }
        public Builder deletionTimestamp(@Nullable String deletionTimestamp) {
            this.deletionTimestamp = deletionTimestamp;
            return this;
        }
        public Builder finalizers(@Nullable List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }
        public Builder generateName(@Nullable String generateName) {
            this.generateName = generateName;
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder managedFields(@Nullable List<ManagedFieldsEntry> managedFields) {
            this.managedFields = managedFields;
            return this;
        }
        public Builder managedFields(ManagedFieldsEntry... managedFields) {
            return managedFields(List.of(managedFields));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder ownerReferences(@Nullable List<OwnerReference> ownerReferences) {
            this.ownerReferences = ownerReferences;
            return this;
        }
        public Builder ownerReferences(OwnerReference... ownerReferences) {
            return ownerReferences(List.of(ownerReferences));
        }
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }        public ObjectMeta build() {
            return new ObjectMeta(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
        }
    }
}
