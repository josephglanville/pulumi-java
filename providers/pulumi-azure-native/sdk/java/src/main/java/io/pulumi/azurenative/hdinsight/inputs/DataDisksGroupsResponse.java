// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataDisksGroupsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataDisksGroupsResponse Empty = new DataDisksGroupsResponse();

    @InputImport(name="diskSizeGB", required=true)
    private final Integer diskSizeGB;

    public Integer getDiskSizeGB() {
        return this.diskSizeGB;
    }

    @InputImport(name="disksPerNode")
    private final @Nullable Integer disksPerNode;

    public Optional<Integer> getDisksPerNode() {
        return this.disksPerNode == null ? Optional.empty() : Optional.ofNullable(this.disksPerNode);
    }

    @InputImport(name="storageAccountType", required=true)
    private final String storageAccountType;

    public String getStorageAccountType() {
        return this.storageAccountType;
    }

    public DataDisksGroupsResponse(
        Integer diskSizeGB,
        @Nullable Integer disksPerNode,
        String storageAccountType) {
        this.diskSizeGB = Objects.requireNonNull(diskSizeGB, "expected parameter 'diskSizeGB' to be non-null");
        this.disksPerNode = disksPerNode;
        this.storageAccountType = Objects.requireNonNull(storageAccountType, "expected parameter 'storageAccountType' to be non-null");
    }

    private DataDisksGroupsResponse() {
        this.diskSizeGB = null;
        this.disksPerNode = null;
        this.storageAccountType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDisksGroupsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGB;
        private @Nullable Integer disksPerNode;
        private String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDisksGroupsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.disksPerNode = defaults.disksPerNode;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setDiskSizeGB(Integer diskSizeGB) {
            this.diskSizeGB = Objects.requireNonNull(diskSizeGB);
            return this;
        }

        public Builder setDisksPerNode(@Nullable Integer disksPerNode) {
            this.disksPerNode = disksPerNode;
            return this;
        }

        public Builder setStorageAccountType(String storageAccountType) {
            this.storageAccountType = Objects.requireNonNull(storageAccountType);
            return this;
        }

        public DataDisksGroupsResponse build() {
            return new DataDisksGroupsResponse(diskSizeGB, disksPerNode, storageAccountType);
        }
    }
}
