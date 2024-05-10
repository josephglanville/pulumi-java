// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeWorkerState extends com.pulumi.resources.ResourceArgs {

    public static final EdgeWorkerState Empty = new EdgeWorkerState();

    /**
     * The unique identifier of the EdgeWorker
     * 
     */
    @Import(name="edgeworkerId")
    private @Nullable Output<Integer> edgeworkerId;

    /**
     * @return The unique identifier of the EdgeWorker
     * 
     */
    public Optional<Output<Integer>> edgeworkerId() {
        return Optional.ofNullable(this.edgeworkerId);
    }

    /**
     * Defines the group association for the EdgeWorker
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return Defines the group association for the EdgeWorker
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The path to the EdgeWorkers tgz code bundle
     * 
     */
    @Import(name="localBundle")
    private @Nullable Output<String> localBundle;

    /**
     * @return The path to the EdgeWorkers tgz code bundle
     * 
     */
    public Optional<Output<String>> localBundle() {
        return Optional.ofNullable(this.localBundle);
    }

    /**
     * The local bundle hash for the EdgeWorker
     * 
     */
    @Import(name="localBundleHash")
    private @Nullable Output<String> localBundleHash;

    /**
     * @return The local bundle hash for the EdgeWorker
     * 
     */
    public Optional<Output<String>> localBundleHash() {
        return Optional.ofNullable(this.localBundleHash);
    }

    /**
     * The EdgeWorker name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The EdgeWorker name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier of a resource tier
     * 
     */
    @Import(name="resourceTierId")
    private @Nullable Output<Integer> resourceTierId;

    /**
     * @return The unique identifier of a resource tier
     * 
     */
    public Optional<Output<Integer>> resourceTierId() {
        return Optional.ofNullable(this.resourceTierId);
    }

    /**
     * The bundle version
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The bundle version
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The list of warnings returned by EdgeWorker validation
     * 
     */
    @Import(name="warnings")
    private @Nullable Output<List<String>> warnings;

    /**
     * @return The list of warnings returned by EdgeWorker validation
     * 
     */
    public Optional<Output<List<String>>> warnings() {
        return Optional.ofNullable(this.warnings);
    }

    private EdgeWorkerState() {}

    private EdgeWorkerState(EdgeWorkerState $) {
        this.edgeworkerId = $.edgeworkerId;
        this.groupId = $.groupId;
        this.localBundle = $.localBundle;
        this.localBundleHash = $.localBundleHash;
        this.name = $.name;
        this.resourceTierId = $.resourceTierId;
        this.version = $.version;
        this.warnings = $.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeWorkerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeWorkerState $;

        public Builder() {
            $ = new EdgeWorkerState();
        }

        public Builder(EdgeWorkerState defaults) {
            $ = new EdgeWorkerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param edgeworkerId The unique identifier of the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder edgeworkerId(@Nullable Output<Integer> edgeworkerId) {
            $.edgeworkerId = edgeworkerId;
            return this;
        }

        /**
         * @param edgeworkerId The unique identifier of the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder edgeworkerId(Integer edgeworkerId) {
            return edgeworkerId(Output.of(edgeworkerId));
        }

        /**
         * @param groupId Defines the group association for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Defines the group association for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param localBundle The path to the EdgeWorkers tgz code bundle
         * 
         * @return builder
         * 
         */
        public Builder localBundle(@Nullable Output<String> localBundle) {
            $.localBundle = localBundle;
            return this;
        }

        /**
         * @param localBundle The path to the EdgeWorkers tgz code bundle
         * 
         * @return builder
         * 
         */
        public Builder localBundle(String localBundle) {
            return localBundle(Output.of(localBundle));
        }

        /**
         * @param localBundleHash The local bundle hash for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder localBundleHash(@Nullable Output<String> localBundleHash) {
            $.localBundleHash = localBundleHash;
            return this;
        }

        /**
         * @param localBundleHash The local bundle hash for the EdgeWorker
         * 
         * @return builder
         * 
         */
        public Builder localBundleHash(String localBundleHash) {
            return localBundleHash(Output.of(localBundleHash));
        }

        /**
         * @param name The EdgeWorker name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The EdgeWorker name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceTierId The unique identifier of a resource tier
         * 
         * @return builder
         * 
         */
        public Builder resourceTierId(@Nullable Output<Integer> resourceTierId) {
            $.resourceTierId = resourceTierId;
            return this;
        }

        /**
         * @param resourceTierId The unique identifier of a resource tier
         * 
         * @return builder
         * 
         */
        public Builder resourceTierId(Integer resourceTierId) {
            return resourceTierId(Output.of(resourceTierId));
        }

        /**
         * @param version The bundle version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The bundle version
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param warnings The list of warnings returned by EdgeWorker validation
         * 
         * @return builder
         * 
         */
        public Builder warnings(@Nullable Output<List<String>> warnings) {
            $.warnings = warnings;
            return this;
        }

        /**
         * @param warnings The list of warnings returned by EdgeWorker validation
         * 
         * @return builder
         * 
         */
        public Builder warnings(List<String> warnings) {
            return warnings(Output.of(warnings));
        }

        /**
         * @param warnings The list of warnings returned by EdgeWorker validation
         * 
         * @return builder
         * 
         */
        public Builder warnings(String... warnings) {
            return warnings(List.of(warnings));
        }

        public EdgeWorkerState build() {
            return $;
        }
    }

}
