// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReliableCollectionsRefResponse {
    /**
     * False (the default) if ReliableCollections state is persisted to disk as usual. True if you do not want to persist state, in which case replication is still enabled and you can use ReliableCollections as distributed cache.
     * 
     */
    private final @Nullable Boolean doNotPersistState;
    /**
     * Name of ReliableCollection resource. Right now it's not used and you can use any string.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ReliableCollectionsRefResponse(
        @CustomType.Parameter("doNotPersistState") @Nullable Boolean doNotPersistState,
        @CustomType.Parameter("name") String name) {
        this.doNotPersistState = doNotPersistState;
        this.name = name;
    }

    /**
     * False (the default) if ReliableCollections state is persisted to disk as usual. True if you do not want to persist state, in which case replication is still enabled and you can use ReliableCollections as distributed cache.
     * 
    */
    public Optional<Boolean> getDoNotPersistState() {
        return Optional.ofNullable(this.doNotPersistState);
    }
    /**
     * Name of ReliableCollection resource. Right now it's not used and you can use any string.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReliableCollectionsRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean doNotPersistState;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReliableCollectionsRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotPersistState = defaults.doNotPersistState;
    	      this.name = defaults.name;
        }

        public Builder doNotPersistState(@Nullable Boolean doNotPersistState) {
            this.doNotPersistState = doNotPersistState;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ReliableCollectionsRefResponse build() {
            return new ReliableCollectionsRefResponse(doNotPersistState, name);
        }
    }
}
