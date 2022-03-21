// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GameServerClusterConnectionInfoGkeClusterReference {
    /**
     * The full or partial name of a GKE cluster, using one of the following
     * forms:
     * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
     * * `locations/{location}/clusters/{cluster_id}`
     * * `{cluster_id}`
     *   If project and location are not specified, the project and location of the
     *   GameServerCluster resource are used to generate the full name of the
     *   GKE cluster.
     * 
     */
    private final String cluster;

    @CustomType.Constructor
    private GameServerClusterConnectionInfoGkeClusterReference(@CustomType.Parameter("cluster") String cluster) {
        this.cluster = cluster;
    }

    /**
     * The full or partial name of a GKE cluster, using one of the following
     * forms:
     * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
     * * `locations/{location}/clusters/{cluster_id}`
     * * `{cluster_id}`
     *   If project and location are not specified, the project and location of the
     *   GameServerCluster resource are used to generate the full name of the
     *   GKE cluster.
     * 
    */
    public String getCluster() {
        return this.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoGkeClusterReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoGkeClusterReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }        public GameServerClusterConnectionInfoGkeClusterReference build() {
            return new GameServerClusterConnectionInfoGkeClusterReference(cluster);
        }
    }
}
